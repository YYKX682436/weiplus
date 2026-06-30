package md3;

/* loaded from: classes.dex */
public final class j implements c00.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407388a;

    public j(java.lang.String str) {
        this.f407388a = str;
    }

    @Override // c00.q3
    /* renamed from: allocTempFile */
    public com.p314xaae8f345.mm.vfs.r6 mo13730x6665a5c5(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        java.lang.String str = this.f407388a;
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229376h;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiHandleEcsAction", "serverProcessName is null, cannot invoke allocTempFile");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16441x299753c5 c16441x299753c5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16441x299753c5) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16440x936dbe7(str, name), md3.f.class);
        java.lang.String str3 = c16441x299753c5 != null ? c16441x299753c5.f229586d : null;
        if (str3 == null || str3.length() == 0) {
            return null;
        }
        return new com.p314xaae8f345.mm.vfs.r6(str3);
    }

    @Override // c00.q3
    /* renamed from: getAbsoluteFilePath */
    public java.lang.String mo13731xbb4d21ce(java.lang.String rawPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rawPath, "rawPath");
        java.lang.String str = this.f407388a;
        if (str == null) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229376h;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBJsApiHandleEcsAction", "serverProcessName is null, cannot invoke getAbsoluteFilePath");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16443x5f3d76ce c16443x5f3d76ce = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16443x5f3d76ce) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1841xbdd923b3.C16442x885519fe(str, rawPath), md3.i.class);
        if (c16443x5f3d76ce != null) {
            return c16443x5f3d76ce.f229589d;
        }
        return null;
    }

    @Override // c00.q3
    /* renamed from: getConfig */
    public org.json.JSONObject mo13732x1456a638() {
        return null;
    }
}
