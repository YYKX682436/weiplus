package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa;

/* renamed from: com.google.android.gms.common.data.BitmapTeleporter */
/* loaded from: classes13.dex */
public class C1880x159e87c7 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.AbstractC1937x9dcc3d32 implements com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1924xbc23c1ff {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.C1880x159e87c7> f5914x681a0c0c = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p203x2eefaa.zaa();

    /* renamed from: _hellAccFlag_ */
    private byte f5915x7f11beae;
    final int zaa;
    android.os.ParcelFileDescriptor zab;
    final int zac;
    private android.graphics.Bitmap zad;
    private boolean zae;
    private java.io.File zaf;

    public C1880x159e87c7(int i17, android.os.ParcelFileDescriptor parcelFileDescriptor, int i18) {
        this.zaa = i17;
        this.zab = parcelFileDescriptor;
        this.zac = i18;
        this.zad = null;
        this.zae = false;
    }

    private static final void zaa(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }

    public android.graphics.Bitmap get() {
        if (!this.zae) {
            java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream((android.os.ParcelFileDescriptor) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zab)));
            try {
                try {
                    byte[] bArr = new byte[dataInputStream.readInt()];
                    int readInt = dataInputStream.readInt();
                    int readInt2 = dataInputStream.readInt();
                    android.graphics.Bitmap.Config valueOf = android.graphics.Bitmap.Config.valueOf(dataInputStream.readUTF());
                    dataInputStream.read(bArr);
                    zaa(dataInputStream);
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(valueOf);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(readInt2));
                    arrayList.add(java.lang.Integer.valueOf(readInt));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/google/android/gms/common/data/BitmapTeleporter", "get", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, createBitmap, "com/google/android/gms/common/data/BitmapTeleporter", "get", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    createBitmap.copyPixelsFromBuffer(wrap);
                    this.zad = createBitmap;
                    this.zae = true;
                } catch (java.io.IOException e17) {
                    throw new java.lang.IllegalStateException("Could not read from parcel file descriptor", e17);
                }
            } catch (java.lang.Throwable th6) {
                zaa(dataInputStream);
                throw th6;
            }
        }
        return this.zad;
    }

    /* renamed from: release */
    public void m17987x41012807() {
        if (this.zae) {
            return;
        }
        try {
            ((android.os.ParcelFileDescriptor) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zab)).close();
        } catch (java.io.IOException unused) {
        }
    }

    /* renamed from: setTempDir */
    public void m17988x5c1ed157(java.io.File file) {
        if (file == null) {
            throw new java.lang.NullPointerException("Cannot set null temp directory");
        }
        this.zaf = file;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i17) {
        if (this.zab == null) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(this.zad);
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            java.io.File file = this.zaf;
            if (file == null) {
                throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                java.io.File createTempFile = java.io.File.createTempFile("teleporter", ".tmp", file);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(createTempFile);
                    this.zab = android.os.ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(array.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(array);
                        } catch (java.io.IOException e17) {
                            throw new java.lang.IllegalStateException("Could not write into unlinked file", e17);
                        }
                    } finally {
                        zaa(dataOutputStream);
                    }
                } catch (java.io.FileNotFoundException unused) {
                    throw new java.lang.IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (java.io.IOException e18) {
                throw new java.lang.IllegalStateException("Could not create temporary file", e18);
            }
        }
        int m18305xd0e7ddf5 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18305xd0e7ddf5(parcel);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 1, this.zaa);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18349x56e29222(parcel, 2, this.zab, i17 | 1, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18336x91f0c790(parcel, 3, this.zac);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1939x1fba1229.m18306x351c62df(parcel, m18305xd0e7ddf5);
        this.zab = null;
    }

    public C1880x159e87c7(android.graphics.Bitmap bitmap) {
        this.zaa = 1;
        this.zab = null;
        this.zac = 0;
        this.zad = bitmap;
        this.zae = true;
    }
}
