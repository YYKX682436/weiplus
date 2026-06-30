package a85;

/* loaded from: classes15.dex */
public class a extends lr.z implements lr.n0 {

    /* renamed from: o, reason: collision with root package name */
    public boolean f83917o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f83918p;

    /* renamed from: q, reason: collision with root package name */
    public int f83919q;

    public a() {
        super(null, 1, null);
        this.f83918p = true;
    }

    @Override // lr.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: B */
    public lr.s0 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        switch (i17) {
            case 100:
                android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cny, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                return new lr.v0(inflate, this.f83917o, this.f402153g);
            case 101:
                android.view.View inflate2 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnv, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
                return new lr.t0(inflate2, null);
            case 102:
            default:
                android.view.View inflate3 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnw, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
                return new lr.y0(inflate3, this.f83918p, this.f402153g);
            case 103:
                android.view.View inflate4 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnx, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
                return new lr.y0(inflate4, this.f83918p, this.f402153g);
            case 104:
                android.view.View inflate5 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnt, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate5);
                return new lr.t0(inflate5, null);
            case 105:
                android.view.View inflate6 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnu, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate6);
                return new lr.u0(inflate6, com.p314xaae8f345.mm.R.id.iln);
            case 106:
                android.view.View inflate7 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnu, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate7);
                return new lr.u0(inflate7, com.p314xaae8f345.mm.R.id.m1x);
            case 107:
                android.view.View inflate8 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnz, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate8);
                return new lr.z0(inflate8);
            case 108:
                android.view.View inflate9 = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cnu, parent, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate9);
                return new lr.u0(inflate9, com.p314xaae8f345.mm.R.id.uz8);
        }
    }

    public void I(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        x(0, new ir.g(emojiInfo, 100, null, 0, 12, null));
    }

    public void J(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        x(0, new ir.g(emojiInfo, 107, null, 0, 12, null));
    }

    @Override // lr.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        if (y(i17) == null) {
            return 100;
        }
        if (y(i17) instanceof ir.g) {
            ir.u0 y17 = y(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(y17, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiItem");
            return ((ir.g) y17).f375370c;
        }
        ir.u0 y18 = y(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(y18);
        return y18.f375440a;
    }

    @Override // lr.z, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z */
    public void mo864xe5e2e48d(lr.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (mo863xcdaf1228(i17) == 100) {
            ((lr.v0) holder).f402127f = this.f83917o;
        }
        if (mo863xcdaf1228(i17) == 103) {
            ((lr.y0) holder).f402146f = this.f83918p;
        }
        if (mo863xcdaf1228(i17) == 102) {
            ((lr.y0) holder).f402146f = this.f83918p;
        }
        if (i17 > this.f83919q) {
            this.f83919q = i17;
        }
        super.mo864xe5e2e48d(holder, i17);
    }
}
