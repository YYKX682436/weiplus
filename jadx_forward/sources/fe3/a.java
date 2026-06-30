package fe3;

/* loaded from: classes7.dex */
public final class a extends lc3.p {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f343069i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f343070m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f343071n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String bizName, java.lang.String instanceName, java.lang.String str) {
        super(instanceName);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
        this.f343069i = bizName;
        this.f343070m = str;
        this.f343071n = "mbpkgs/" + bizName + ".wspkg";
    }

    @Override // jc3.x
    public java.lang.String g() {
        return this.f343069i;
    }

    @Override // lc3.o
    public boolean j() {
        java.lang.String str = this.f343069i;
        java.lang.String str2 = this.f343070m;
        if (str2 == null) {
            java.lang.Boolean a17 = jc3.w0.f380543a.a(str);
            if (a17 != null) {
                return a17.booleanValue();
            }
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MagicCommonPkgManagement", "enableCheckRemoteUDR: bizName=" + str + ", projectId=" + str2 + ", result=true (dynamic biz)");
        return true;
    }

    @Override // lc3.o
    public lc3.a k() {
        java.util.Map map = ge3.s.f352507a;
        ge3.a aVar = (ge3.a) ge3.s.f352507a.get(this.f343069i);
        if (aVar != null) {
            return new lc3.a(this.f343071n, aVar.c(), aVar.mo131355xb5885648(), aVar.d());
        }
        return null;
    }

    @Override // lc3.o
    public lc3.c n() {
        return new lc3.c(this.f343071n, lc3.b.f399415d);
    }

    @Override // lc3.o
    public java.lang.String s() {
        return "/index.js";
    }

    @Override // lc3.o
    public java.lang.String u() {
        java.lang.String str = this.f343069i;
        java.lang.String str2 = this.f343070m;
        if (str2 == null) {
            return jc3.w0.f380543a.b(str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MircoMsg.MagicCommonPkgManagement", "getUDRProjectId: bizName=" + str + ", projectId=" + str2 + " (from param)");
        return str2;
    }

    @Override // lc3.o
    public java.lang.String v() {
        return this.f343069i;
    }
}
