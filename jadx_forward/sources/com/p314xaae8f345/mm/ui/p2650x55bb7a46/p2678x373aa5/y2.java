package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class y2 implements u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f284689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f284690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f284691c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f284692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f284693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f284694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.z2 f284695g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284696h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroupOverlay f284697i;

    public y2(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.List list, yz5.a aVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.z2 z2Var, java.lang.String str, android.view.ViewGroupOverlay viewGroupOverlay) {
        this.f284689a = f0Var;
        this.f284690b = i18;
        this.f284691c = c0Var;
        this.f284692d = h0Var;
        this.f284693e = list;
        this.f284694f = aVar;
        this.f284695g = z2Var;
        this.f284696h = str;
        this.f284697i = viewGroupOverlay;
    }

    @Override // u3.p
    public final void a(u3.s sVar, boolean z17, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f284689a;
        int i17 = f0Var.f391649d + 1;
        f0Var.f391649d = i17;
        if (i17 >= this.f284690b) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f284691c;
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2 u2Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.u2) this.f284692d.f391656d;
            if (u2Var != null) {
                this.f284695g.f284703a.remove(this.f284696h, u2Var);
            }
            java.util.Iterator it = this.f284693e.iterator();
            while (it.hasNext()) {
                this.f284697i.remove((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.v2) it.next());
            }
            yz5.a aVar = this.f284694f;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
    }
}
