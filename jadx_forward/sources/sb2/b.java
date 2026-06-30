package sb2;

/* loaded from: classes2.dex */
public final class b extends tc2.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        in5.s0 s0Var = this.f498674d.f498682i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = s0Var != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i : null;
        if (s0Var != null) {
            zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
            int hashCode = s0Var.hashCode();
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.view.Window window = ((android.app.Activity) context).getWindow();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(window, "getWindow(...)");
            long j17 = 0;
            long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && (m59258xd0557130 = feedObject.m59258xd0557130()) != null) {
                j17 = m59258xd0557130.m75942xfb822ef2(0);
            }
            ((b92.d2) d8Var).wi(hashCode, "FinderFeedFullLive", str2, context, window, mo2128x1ed62e84, j17);
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.String str;
        in5.s0 s0Var = this.f498674d.f498682i;
        if (s0Var != null) {
            zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
            int hashCode = s0Var.hashCode();
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                str = "";
            }
            ((b92.d2) d8Var).Ai(hashCode, "FinderFeedFullLive", str);
        }
    }
}
