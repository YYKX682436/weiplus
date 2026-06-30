package zl0;

/* loaded from: classes13.dex */
public class b extends zl0.a {
    static {
        com.p314xaae8f345.mm.vfs.q7.c("PublicResource");
    }

    public b(java.lang.String str) {
        this.f555091c = str;
    }

    @Override // zl0.a
    public java.lang.String b() {
        return c();
    }

    @Override // zl0.a
    public java.lang.String c() {
        return zl0.g.f555099c + "/" + this.f555091c + ".json";
    }

    @Override // zl0.a
    public boolean d() {
        return true;
    }

    @Override // zl0.a
    /* renamed from: toString */
    public java.lang.String mo179080x9616526c() {
        return "FewshotModel{moduleName='" + this.f555091c + '}';
    }
}
