package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.ErrorLogResult */
/* loaded from: classes11.dex */
public class C28680xc561b779 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result {

    /* renamed from: level */
    private int f71595x6219b84;
    private java.lang.String tag;

    public C28680xc561b779(java.lang.String str) {
        this(str, io.p3284xd2ae381c.Log.f70429x288a86);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: error */
    public void mo65718x5c4d208(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i17 = this.f71595x6219b84;
        if (i17 < io.p3284xd2ae381c.Log.f70429x288a86) {
            return;
        }
        io.p3284xd2ae381c.Log.m136960xed3dc8ef(i17, this.tag, str2 + str3);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: notImplemented */
    public void mo65719xbc9fa82f() {
        int i17 = this.f71595x6219b84;
        if (i17 < io.p3284xd2ae381c.Log.f70429x288a86) {
            return;
        }
        io.p3284xd2ae381c.Log.m136960xed3dc8ef(i17, this.tag, "method not implemented");
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: success */
    public void mo65720x90b54003(java.lang.Object obj) {
    }

    public C28680xc561b779(java.lang.String str, int i17) {
        this.tag = str;
        this.f71595x6219b84 = i17;
    }
}
