package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPDiskReadWrite */
/* loaded from: classes13.dex */
public class C26566xc609bdb0 {
    public static final java.lang.String TAG = "TPDiskReadWrite";

    /* renamed from: mKey */
    private java.util.ArrayList<java.lang.String> f55287x32b2b2;

    /* renamed from: mKeyCache */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26563xc2f3a6f7 f55288x4148ebf0;

    /* renamed from: mKeyCacheName */
    private java.lang.String f55289x5a36629b;

    /* renamed from: mMessageCache */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26563xc2f3a6f7 f55290x4959c4c8;

    public C26566xc609bdb0(android.content.Context context, java.lang.String str) {
        this.f55290x4959c4c8 = null;
        this.f55288x4148ebf0 = null;
        this.f55287x32b2b2 = null;
        this.f55289x5a36629b = null;
        this.f55290x4959c4c8 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26563xc2f3a6f7.get(context, str);
        java.lang.String str2 = str + "_key";
        this.f55289x5a36629b = str2;
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26563xc2f3a6f7 c26563xc2f3a6f7 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26563xc2f3a6f7.get(context, str2);
        this.f55288x4148ebf0 = c26563xc2f3a6f7;
        java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) c26563xc2f3a6f7.m104228x27fe6b87(this.f55289x5a36629b);
        this.f55287x32b2b2 = arrayList;
        if (arrayList == null) {
            this.f55287x32b2b2 = new java.util.ArrayList<>();
        }
    }

    /* renamed from: clearAllFile */
    public synchronized void m104284xc82fcbb0() {
        this.f55290x4959c4c8.m104221x5a5b64d();
        this.f55288x4148ebf0.m104221x5a5b64d();
        this.f55287x32b2b2.clear();
    }

    /* renamed from: getKeylist */
    public synchronized java.util.ArrayList<java.lang.String> m104285xd3d4347() {
        return (java.util.ArrayList) this.f55287x32b2b2.clone();
    }

    /* renamed from: readAllFile */
    public synchronized java.lang.Object m104286x9d889447() {
        java.lang.Object m104228x27fe6b87;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f55288x4148ebf0.m104228x27fe6b87(this.f55289x5a36629b);
        java.util.ArrayList arrayList2 = null;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.lang.String str = (java.lang.String) arrayList.get(i17);
                if (!android.text.TextUtils.isEmpty(str) && (m104228x27fe6b87 = this.f55290x4959c4c8.m104228x27fe6b87(str)) != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList();
                    }
                    arrayList2.add(m104228x27fe6b87);
                }
            }
            this.f55290x4959c4c8.m104221x5a5b64d();
            this.f55288x4148ebf0.m104221x5a5b64d();
            this.f55287x32b2b2.clear();
            return arrayList2;
        }
        return null;
    }

    /* renamed from: readFile */
    public synchronized java.lang.Object m104287xcc440832(java.lang.String str) {
        return this.f55290x4959c4c8.m104228x27fe6b87(str);
    }

    /* renamed from: rmFile */
    public synchronized void m104288xc8a9e257(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        this.f55290x4959c4c8.m104230xc84af884(str);
        this.f55287x32b2b2.remove(str);
        this.f55288x4148ebf0.m104230xc84af884(this.f55289x5a36629b);
        if (!this.f55287x32b2b2.isEmpty()) {
            this.f55288x4148ebf0.put(this.f55289x5a36629b, this.f55287x32b2b2);
        }
    }

    /* renamed from: writeFile */
    public synchronized void m104289xac26b9fb(java.lang.String str, java.io.Serializable serializable) {
        if (serializable != null) {
            if (!android.text.TextUtils.isEmpty(str)) {
                this.f55290x4959c4c8.m104230xc84af884(str);
                this.f55290x4959c4c8.put(str, serializable);
                this.f55287x32b2b2.remove(str);
                this.f55287x32b2b2.add(str);
                this.f55288x4148ebf0.m104230xc84af884(this.f55289x5a36629b);
                this.f55288x4148ebf0.put(this.f55289x5a36629b, this.f55287x32b2b2);
            }
        }
    }
}
