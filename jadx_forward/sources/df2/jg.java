package df2;

/* loaded from: classes3.dex */
public final class jg implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ug f312010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.g f312011e;

    public jg(df2.ug ugVar, jz5.g gVar) {
        this.f312010d = ugVar;
        this.f312011e = gVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public final java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean z17 = obj instanceof dk2.zf;
        jz5.f0 f0Var = jz5.f0.f384359a;
        df2.ug ugVar = this.f312010d;
        if (z17 && (obj instanceof dk2.cg)) {
            jz5.g gVar = this.f312011e;
            df2.tf tfVar = (df2.tf) gVar.mo141623x754a37bb();
            dk2.zf zfVar = (dk2.zf) obj;
            java.lang.String f17 = zfVar.f();
            if (f17 == null) {
                f17 = "";
            }
            dk2.cg msg = (dk2.cg) obj;
            tfVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tfVar.f312969a, f17) && tfVar.f312971c == msg.o() && tfVar.f312970b == msg.s() && tfVar.f312972d == msg.g()) {
                java.lang.String str = ugVar.f313055m;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveDanmaku_step3_0 updateCommentDanmakuMsg ");
                sb6.append(obj.hashCode());
                sb6.append(", ");
                dk2.zf zfVar2 = (dk2.zf) obj;
                sb6.append(zfVar2.j());
                sb6.append(",seq:");
                sb6.append(zfVar2.m());
                sb6.append(" same with last!");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                df2.tf tfVar2 = (df2.tf) gVar.mo141623x754a37bb();
                java.lang.String f18 = zfVar2.f();
                tfVar2.a(f18 != null ? f18 : "", (dk2.cg) obj);
                return f0Var;
            }
            df2.tf tfVar3 = (df2.tf) gVar.mo141623x754a37bb();
            java.lang.String f19 = zfVar.f();
            tfVar3.a(f19 != null ? f19 : "", msg);
            java.lang.String str2 = ugVar.f313055m;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveDanmaku_step3_0 updateCommentDanmakuMsg ");
            sb7.append(obj.hashCode());
            sb7.append(',');
            dk2.zf zfVar3 = (dk2.zf) obj;
            sb7.append(zfVar3.j());
            sb7.append(",seq:");
            sb7.append(zfVar3.m());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7.toString());
            xs2.u uVar = ugVar.f313059q;
            if (uVar != null) {
                uVar.c(obj);
            }
        } else if (obj instanceof lm2.c) {
            java.lang.String str3 = ugVar.f313055m;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("LiveDanmaku_step3_0 updateBoxDanmakuMsg ");
            lm2.c cVar = (lm2.c) obj;
            sb8.append(cVar.hashCode());
            sb8.append(',');
            sb8.append(cVar.j());
            sb8.append(",seq:");
            sb8.append(cVar.e());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb8.toString());
            xs2.u uVar2 = ugVar.f313059q;
            if (uVar2 != null) {
                uVar2.c(obj);
            }
        }
        return f0Var;
    }
}
