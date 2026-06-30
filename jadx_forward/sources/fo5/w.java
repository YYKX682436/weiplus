package fo5;

/* loaded from: classes11.dex */
public final class w implements p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346667a;

    public w(yz5.l lVar) {
        this.f346667a = lVar;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.b
    public void a(java.lang.Object obj) {
        jz5.f0 f0Var;
        jz5.o oVar = (jz5.o) obj;
        yz5.l lVar = this.f346667a;
        if (oVar != null) {
            java.lang.String str = (java.lang.String) oVar.f384374d;
            java.lang.String str2 = (java.lang.String) oVar.f384375e;
            java.lang.String str3 = (java.lang.String) oVar.f384376f;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2883xcfa97743.C25217x98ba1c58(str, str2, str3))));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("FileSelectorContract: result is null")))));
        }
    }
}
