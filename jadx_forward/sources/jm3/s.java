package jm3;

/* loaded from: classes10.dex */
public final class s implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381883d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a) {
        this.f381883d = activityC16653xffd2636a;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activity = this.f381883d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) a18;
        jz5.g gVar = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.v4) a17).f233026m;
        if (num != null && num.intValue() == 1) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            h4Var.S6().setVisibility(8);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a Z6 = activity.Z6();
            if (Z6 != null) {
                if (!Z6.D) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.r(Z6, Z6.f233158l1, Z6.f233174x1, false, null, null, 28, null);
                }
                Z6.W = 3;
                Z6.l();
                Z6.p(true, 2000);
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16699x54869e90 c16699x54869e90 = Z6.f233171w;
                if (c16699x54869e90 != null) {
                    c16699x54869e90.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e3 = Z6.f233172x;
                if (c16702xded4f4e3 != null) {
                    c16702xded4f4e3.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16700x73de4a58 c16700x73de4a58 = Z6.f233175y;
                if (c16700x73de4a58 != null) {
                    c16700x73de4a58.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16701xf06424da c16701xf06424da = Z6.f233178z;
                if (c16701xf06424da != null) {
                    c16701xf06424da.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16703x9178fa1f c16703x9178fa1f = Z6.f233162p;
                if (c16703x9178fa1f != null) {
                    c16703x9178fa1f.m67343xf939df19().m8146xced61ae5();
                    return;
                }
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 0) {
            ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
            h4Var.S6().setVisibility(0);
            if (h4Var.f232700n.f233397m == -1) {
                h4Var.S6().post(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.x3(h4Var));
            }
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a Z62 = activity.Z6();
            if (Z62 != null) {
                if (!Z62.D) {
                    com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.r(Z62, Z62.f233174x1, Z62.f233158l1, false, null, null, 28, null);
                }
                Z62.W = 2;
                Z62.l();
                Z62.p(false, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a.B1);
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16699x54869e90 c16699x54869e902 = Z62.f233171w;
                if (c16699x54869e902 != null) {
                    c16699x54869e902.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16702xded4f4e3 c16702xded4f4e32 = Z62.f233172x;
                if (c16702xded4f4e32 != null) {
                    c16702xded4f4e32.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16700x73de4a58 c16700x73de4a582 = Z62.f233175y;
                if (c16700x73de4a582 != null) {
                    c16700x73de4a582.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16701xf06424da c16701xf06424da2 = Z62.f233178z;
                if (c16701xf06424da2 != null) {
                    c16701xf06424da2.m67343xf939df19().m8146xced61ae5();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16703x9178fa1f c16703x9178fa1f2 = Z62.f233162p;
                if (c16703x9178fa1f2 != null) {
                    c16703x9178fa1f2.m67343xf939df19().m8146xced61ae5();
                }
            }
        }
    }
}
