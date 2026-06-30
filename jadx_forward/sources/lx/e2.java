package lx;

/* loaded from: classes7.dex */
public final class e2 implements rv.f3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f403273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403274b;

    public e2(lx.i2 i2Var, yz5.l lVar) {
        this.f403273a = i2Var;
        this.f403274b = lVar;
    }

    @Override // rv.f3
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l17, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        lx.i2.a(this.f403273a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editTextCover: result received, filePath=" + str + ", picId=" + str2);
        yz5.l lVar = this.f403274b;
        if (str != null) {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.biz.C23249xee57bcfe(str, l17, str3, str2, str5, str4, str6))));
        } else {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        }
    }

    @Override // rv.f3
    public void b(boolean z17) {
    }

    @Override // rv.f3
    /* renamed from: onCancel */
    public void mo50711x3d6f0539() {
        lx.i2.a(this.f403273a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizMediaPlugin", "editTextCover: cancelled by user");
        this.f403274b.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
    }
}
