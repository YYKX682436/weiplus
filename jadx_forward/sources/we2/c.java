package we2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f526751a;

    /* renamed from: b, reason: collision with root package name */
    public int f526752b;

    /* renamed from: c, reason: collision with root package name */
    public we2.b f526753c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f526754d = "";

    /* renamed from: toString */
    public java.lang.String m173634x9616526c() {
        java.lang.Object obj;
        r45.r71 r71Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderGetLiveMsgRespWrapper: errCode:");
        sb6.append(this.f526751a);
        sb6.append(",errType:");
        sb6.append(this.f526752b);
        sb6.append(",resp:");
        we2.b bVar = this.f526753c;
        if (bVar == null || (r71Var = bVar.f526747a) == null || (obj = pm0.b0.g(r71Var)) == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(",reqVisitorRoleType:");
        we2.b bVar2 = this.f526753c;
        sb6.append(bVar2 != null ? java.lang.Integer.valueOf(bVar2.f526748b) : null);
        sb6.append(",uniqueId:");
        sb6.append(this.f526754d);
        sb6.append(',');
        return sb6.toString();
    }
}
