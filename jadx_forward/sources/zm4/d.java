package zm4;

/* loaded from: classes8.dex */
public final class d extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        jz5.h.b(new zm4.c(this));
    }

    public final zm4.a O6(boolean z17) {
        zm4.a aVar = new zm4.a(null, 1, null);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        java.util.List<wm4.y> list = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.d.class)).f256483e;
        if (list != null) {
            for (wm4.y yVar : list) {
                zm4.b bVar = new zm4.b();
                bVar.f555710a = yVar.f528851b;
                android.app.Activity context = m80379x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1.class);
                int i17 = yVar.f528851b;
                int i18 = y1Var.f256648f;
                bVar.f555715f = i18 != -1 && i18 == i17;
                bVar.f555714e = yVar.f528856g;
                bVar.f555713d = yVar.f528860k;
                if (z17) {
                    android.app.Activity context2 = m80379x76847179();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                    if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1 y1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.y1) a17;
                    java.lang.Integer num = y1Var2.f256651i;
                    int i19 = yVar.f528851b;
                    if (num != null && num.intValue() == i19) {
                        bVar.f555711b = y1Var2.f256649g;
                        bVar.f555712c = y1Var2.f256650h;
                    }
                } else {
                    bVar.f555711b = yVar.f528858i;
                    bVar.f555712c = yVar.f528859j;
                }
                aVar.f555709a.add(bVar);
            }
        }
        return aVar;
    }
}
