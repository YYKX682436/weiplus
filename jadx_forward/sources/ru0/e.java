package ru0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f481195a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f481196b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f481197c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.r6 f481198d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f481199e;

    public e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID, java.lang.String roleID, java.lang.String roleName, com.p314xaae8f345.mm.vfs.r6 r6Var, java.util.Map textDurationMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleID, "roleID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roleName, "roleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textDurationMap, "textDurationMap");
        this.f481195a = segmentID;
        this.f481196b = roleID;
        this.f481197c = roleName;
        this.f481198d = r6Var;
        this.f481199e = textDurationMap;
    }

    /* renamed from: equals */
    public boolean m163018xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.e)) {
            return false;
        }
        ru0.e eVar = (ru0.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481195a, eVar.f481195a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481196b, eVar.f481196b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481197c, eVar.f481197c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481198d, eVar.f481198d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f481199e, eVar.f481199e);
    }

    /* renamed from: hashCode */
    public int m163019x8cdac1b() {
        int m32423x8cdac1b = ((((this.f481195a.m32423x8cdac1b() * 31) + this.f481196b.hashCode()) * 31) + this.f481197c.hashCode()) * 31;
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f481198d;
        return ((m32423x8cdac1b + (r6Var == null ? 0 : r6Var.m82468x8cdac1b())) * 31) + this.f481199e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m163020x9616526c() {
        return "RoleResult(segmentID=" + this.f481195a + ", roleID=" + this.f481196b + ", roleName=" + this.f481197c + ", roleFile=" + this.f481198d + ", textDurationMap=" + this.f481199e + ')';
    }

    public /* synthetic */ e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.vfs.r6 r6Var, java.util.Map map, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(c3971x241f78, str, str2, r6Var, (i17 & 16) != 0 ? kz5.q0.f395534d : map);
    }
}
