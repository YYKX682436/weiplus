package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.ContentsSchemeResolver */
/* loaded from: classes12.dex */
public final class C22742xf6063ea5 extends com.p314xaae8f345.mm.vfs.AbstractC22766xe7748d96 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.vfs.c0 f39790x681a0c0c = new com.p314xaae8f345.mm.vfs.c0(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.C22742xf6063ea5.ContentProviderFileSystem f294233d = new com.p314xaae8f345.mm.vfs.C22742xf6063ea5.ContentProviderFileSystem(com.p314xaae8f345.mm.vfs.a3.f294314a.f294346d);

    /* renamed from: com.tencent.mm.vfs.ContentsSchemeResolver$ContentProviderFileSystem */
    /* loaded from: classes12.dex */
    public static final class ContentProviderFileSystem extends com.p314xaae8f345.mm.vfs.a implements com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22742xf6063ea5.ContentProviderFileSystem> f39791x681a0c0c = null;

        /* renamed from: e, reason: collision with root package name */
        public final android.content.ContentResolver f294234e;

        public ContentProviderFileSystem(android.content.Context context) {
            this.f294234e = context.getContentResolver();
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.lang.Iterable C(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.lang.String D(java.lang.String str, boolean z17) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean F(java.lang.String str) {
            return m(str) != null;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.io.InputStream a(java.lang.String str) {
            try {
                java.io.InputStream openInputStream = this.f294234e.openInputStream(android.net.Uri.parse(str));
                if (openInputStream != null) {
                    return openInputStream;
                }
                throw new java.io.FileNotFoundException("ContentResolver returns null");
            } catch (java.lang.RuntimeException e17) {
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException(str + " cannot be opened: " + e17.getMessage()).initCause(e17));
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.a0
        public java.lang.Object b(java.util.Map map) {
            return this;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.io.OutputStream c(java.lang.String str, boolean z17) {
            try {
                java.io.OutputStream openOutputStream = this.f294234e.openOutputStream(android.net.Uri.parse(str), z17 ? "wa" : "w");
                if (openOutputStream != null) {
                    return openOutputStream;
                }
                throw new java.io.FileNotFoundException("ContentResolver returns null");
            } catch (java.lang.RuntimeException e17) {
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException(str + " cannot be opened: " + e17.getMessage()).initCause(e17));
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean d(java.lang.String str) {
            try {
                return this.f294234e.delete(android.net.Uri.parse(str), null, null) >= 1;
            } catch (java.lang.RuntimeException unused) {
                return false;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean e(java.lang.String str, boolean z17) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public com.p314xaae8f345.mm.vfs.o2 g(java.lang.String str) {
            return new com.p314xaae8f345.mm.vfs.o2();
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        /* renamed from: list */
        public java.lang.Iterable mo82286x32b09e(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public com.p314xaae8f345.mm.vfs.x1 m(java.lang.String str) {
            android.database.Cursor cursor;
            android.database.Cursor cursor2 = null;
            try {
                cursor = this.f294234e.query(android.net.Uri.parse(str), null, null, null, null);
                if (cursor == null) {
                    com.p314xaae8f345.mm.vfs.e8.d(cursor);
                    return null;
                }
                try {
                    int columnIndex = cursor.getColumnIndex("_display_name");
                    int columnIndex2 = cursor.getColumnIndex("_size");
                    if (!cursor.moveToFirst()) {
                        com.p314xaae8f345.mm.vfs.e8.d(cursor);
                        return null;
                    }
                    com.p314xaae8f345.mm.vfs.x1 x1Var = new com.p314xaae8f345.mm.vfs.x1(this, str, cursor.getString(columnIndex), cursor.getLong(columnIndex2), 0L, 0L, false);
                    com.p314xaae8f345.mm.vfs.e8.d(cursor);
                    return x1Var;
                } catch (java.lang.RuntimeException unused) {
                    com.p314xaae8f345.mm.vfs.e8.d(cursor);
                    return null;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    cursor2 = cursor;
                    com.p314xaae8f345.mm.vfs.e8.d(cursor2);
                    throw th;
                }
            } catch (java.lang.RuntimeException unused2) {
                cursor = null;
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean n(java.lang.String str, long j17) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public int o() {
            return 1;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean r(java.lang.String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.p314xaae8f345.mm.vfs.a, com.p314xaae8f345.mm.vfs.q2
        public android.os.ParcelFileDescriptor x(java.lang.String str, java.lang.String str2) {
            try {
                android.os.ParcelFileDescriptor openFileDescriptor = this.f294234e.openFileDescriptor(android.net.Uri.parse(str), str2);
                if (openFileDescriptor != null) {
                    return openFileDescriptor;
                }
                throw new java.io.FileNotFoundException("ContentResolver returns null");
            } catch (java.lang.RuntimeException e17) {
                throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException(str + " cannot be opened: " + e17.getMessage()).initCause(e17));
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
            return this;
        }
    }

    public C22742xf6063ea5(com.p314xaae8f345.mm.vfs.b0 b0Var) {
    }

    @Override // com.p314xaae8f345.mm.vfs.s5
    public android.util.Pair a(com.p314xaae8f345.mm.vfs.m5 m5Var, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = z7Var.f294810d;
        if (str != null) {
            sb6.append(str);
            sb6.append(':');
        }
        java.lang.String str2 = z7Var.f294811e;
        if (str2 != null) {
            sb6.append("//");
            sb6.append(str2);
        }
        java.lang.String str3 = z7Var.f294812f;
        if (str3 != null) {
            sb6.append(str3);
        }
        return android.util.Pair.create(this.f294233d, sb6.toString());
    }
}
