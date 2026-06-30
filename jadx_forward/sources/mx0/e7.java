package mx0;

/* loaded from: classes5.dex */
public final class e7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.v f413497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.v f413498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, yx0.v vVar, yx0.v vVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413496d = c10977x8e40eced;
        this.f413497e = vVar;
        this.f413498f = vVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.e7(this.f413496d, this.f413497e, this.f413498f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.e7 e7Var = (mx0.e7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        boolean z17;
        android.view.ViewGroup m47322xf4882cee;
        android.view.ViewGroup m47322xf4882cee2;
        android.view.ViewGroup m47322xf4882cee3;
        mx0.x m47313xff1c565a;
        mx0.o1 m47307x8c723d89;
        mx0.l m47302x7ff74ce5;
        mx0.g3 m47316xc93d195a;
        mx0.g3 m47316xc93d195a2;
        mx0.g3 m47316xc93d195a3;
        mx0.g3 m47316xc93d195a4;
        mx0.g3 m47316xc93d195a5;
        mx0.g3 m47316xc93d195a6;
        mx0.g3 m47316xc93d195a7;
        mx0.j3 m47317x88f0df07;
        mx0.x m47313xff1c565a2;
        mx0.o1 m47307x8c723d892;
        mx0.l m47302x7ff74ce52;
        android.view.ViewGroup m47322xf4882cee4;
        android.view.ViewGroup m47322xf4882cee5;
        android.view.ViewGroup m47322xf4882cee6;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413496d;
        m47319x71e92c1d = c10977x8e40eced.m47319x71e92c1d();
        yx0.v vVar = this.f413497e;
        switch (vVar.ordinal()) {
            case 0:
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
                z17 = true;
                break;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 13:
            case 14:
            case 15:
                z17 = false;
                break;
            default:
                throw new jz5.j();
        }
        m47319x71e92c1d.setEnabled(z17);
        if (kz5.c0.i(yx0.v.f549228f, yx0.v.f549235p, yx0.v.f549233n).contains(vVar)) {
            m47322xf4882cee4 = c10977x8e40eced.m47322xf4882cee();
            m47322xf4882cee4.setEnabled(true);
            m47322xf4882cee5 = c10977x8e40eced.m47322xf4882cee();
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(m47322xf4882cee5, mx0.c7.f413420d);
            m47322xf4882cee6 = c10977x8e40eced.m47322xf4882cee();
            m47322xf4882cee6.setAlpha(1.0f);
        } else {
            m47322xf4882cee = c10977x8e40eced.m47322xf4882cee();
            m47322xf4882cee.setEnabled(false);
            m47322xf4882cee2 = c10977x8e40eced.m47322xf4882cee();
            com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(m47322xf4882cee2, mx0.d7.f413452d);
            m47322xf4882cee3 = c10977x8e40eced.m47322xf4882cee();
            m47322xf4882cee3.setAlpha(0.7f);
        }
        int ordinal = vVar.ordinal();
        if (ordinal == 2 || ordinal == 7) {
            m47313xff1c565a = c10977x8e40eced.m47313xff1c565a();
            mx0.q2 q2Var = (mx0.q2) m47313xff1c565a;
            q2Var.e().setEnabled(true);
            if (q2Var.f413771i == 0) {
                q2Var.e().animate().cancel();
                q2Var.e().animate().alpha(1.0f).setDuration(300L).start();
            }
            m47307x8c723d89 = c10977x8e40eced.m47307x8c723d89();
            m47307x8c723d89.b();
            m47302x7ff74ce5 = c10977x8e40eced.m47302x7ff74ce5();
            m47302x7ff74ce5.e(true);
        } else {
            m47313xff1c565a2 = c10977x8e40eced.m47313xff1c565a();
            ((mx0.q2) m47313xff1c565a2).b();
            m47307x8c723d892 = c10977x8e40eced.m47307x8c723d89();
            m47307x8c723d892.a();
            m47302x7ff74ce52 = c10977x8e40eced.m47302x7ff74ce5();
            m47302x7ff74ce52.e(false);
        }
        yx0.v vVar2 = yx0.v.f549238s;
        if (this.f413498f == vVar2) {
            m47316xc93d195a5 = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a5.b(false);
            m47316xc93d195a6 = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a6.mo9066x6761d4f();
            m47316xc93d195a7 = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a7.b(true);
            m47317x88f0df07 = c10977x8e40eced.m47317x88f0df07();
            m47317x88f0df07.b();
        }
        if (vVar == vVar2) {
            m47316xc93d195a4 = c10977x8e40eced.m47316xc93d195a();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = m47316xc93d195a4.f413526g;
            c10973x5ab09303.setContentDescription(i65.a.r(c10973x5ab09303.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.mct));
        } else {
            m47316xc93d195a = c10977x8e40eced.m47316xc93d195a();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab093032 = m47316xc93d195a.f413526g;
            c10973x5ab093032.setContentDescription(i65.a.r(c10973x5ab093032.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.mcs));
        }
        switch (vVar.ordinal()) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 13:
            case 14:
            case 15:
            case 16:
                m47316xc93d195a2 = c10977x8e40eced.m47316xc93d195a();
                m47316xc93d195a2.a();
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p910x4941b224.C10990x39b653c9 c10990x39b653c9 = c10977x8e40eced.Q;
                if (c10990x39b653c9 != null) {
                    c10990x39b653c9.setEnabled(false);
                    c10990x39b653c9.setAlpha(0.7f);
                    break;
                }
                break;
            case 2:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 17:
                m47316xc93d195a3 = c10977x8e40eced.m47316xc93d195a();
                m47316xc93d195a3.f413523d.setEnabled(true);
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab093033 = m47316xc93d195a3.f413526g;
                c10973x5ab093033.m47281xbc91ffe0(true);
                c10973x5ab093033.setAlpha(1.0f);
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p910x4941b224.C10990x39b653c9 c10990x39b653c92 = c10977x8e40eced.Q;
                if (c10990x39b653c92 != null) {
                    c10990x39b653c92.setEnabled(true);
                    c10990x39b653c92.setAlpha(1.0f);
                    break;
                }
                break;
        }
        return jz5.f0.f384359a;
    }
}
