package a85;

/* loaded from: classes15.dex */
public class a extends lr.z implements lr.n0 {

    /* renamed from: o, reason: collision with root package name */
    public boolean f2384o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2385p;

    /* renamed from: q, reason: collision with root package name */
    public int f2386q;

    public a() {
        super(null, 1, null);
        this.f2385p = true;
    }

    @Override // lr.z, androidx.recyclerview.widget.f2
    /* renamed from: B */
    public lr.s0 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(parent.getContext());
        switch (i17) {
            case 100:
                android.view.View inflate = from.inflate(com.tencent.mm.R.layout.cny, parent, false);
                kotlin.jvm.internal.o.d(inflate);
                return new lr.v0(inflate, this.f2384o, this.f320620g);
            case 101:
                android.view.View inflate2 = from.inflate(com.tencent.mm.R.layout.cnv, parent, false);
                kotlin.jvm.internal.o.d(inflate2);
                return new lr.t0(inflate2, null);
            case 102:
            default:
                android.view.View inflate3 = from.inflate(com.tencent.mm.R.layout.cnw, parent, false);
                kotlin.jvm.internal.o.d(inflate3);
                return new lr.y0(inflate3, this.f2385p, this.f320620g);
            case 103:
                android.view.View inflate4 = from.inflate(com.tencent.mm.R.layout.cnx, parent, false);
                kotlin.jvm.internal.o.d(inflate4);
                return new lr.y0(inflate4, this.f2385p, this.f320620g);
            case 104:
                android.view.View inflate5 = from.inflate(com.tencent.mm.R.layout.cnt, parent, false);
                kotlin.jvm.internal.o.d(inflate5);
                return new lr.t0(inflate5, null);
            case 105:
                android.view.View inflate6 = from.inflate(com.tencent.mm.R.layout.cnu, parent, false);
                kotlin.jvm.internal.o.d(inflate6);
                return new lr.u0(inflate6, com.tencent.mm.R.id.iln);
            case 106:
                android.view.View inflate7 = from.inflate(com.tencent.mm.R.layout.cnu, parent, false);
                kotlin.jvm.internal.o.d(inflate7);
                return new lr.u0(inflate7, com.tencent.mm.R.id.m1x);
            case 107:
                android.view.View inflate8 = from.inflate(com.tencent.mm.R.layout.cnz, parent, false);
                kotlin.jvm.internal.o.d(inflate8);
                return new lr.z0(inflate8);
            case 108:
                android.view.View inflate9 = from.inflate(com.tencent.mm.R.layout.cnu, parent, false);
                kotlin.jvm.internal.o.d(inflate9);
                return new lr.u0(inflate9, com.tencent.mm.R.id.uz8);
        }
    }

    public void I(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        x(0, new ir.g(emojiInfo, 100, null, 0, 12, null));
    }

    public void J(com.tencent.mm.api.IEmojiInfo emojiInfo) {
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        x(0, new ir.g(emojiInfo, 107, null, 0, 12, null));
    }

    @Override // lr.z, androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (y(i17) == null) {
            return 100;
        }
        if (y(i17) instanceof ir.g) {
            ir.u0 y17 = y(i17);
            kotlin.jvm.internal.o.e(y17, "null cannot be cast to non-null type com.tencent.mm.emoji.model.panel.EmojiItem");
            return ((ir.g) y17).f293837c;
        }
        ir.u0 y18 = y(i17);
        kotlin.jvm.internal.o.d(y18);
        return y18.f293907a;
    }

    @Override // lr.z, androidx.recyclerview.widget.f2
    /* renamed from: z */
    public void onBindViewHolder(lr.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (getItemViewType(i17) == 100) {
            ((lr.v0) holder).f320594f = this.f2384o;
        }
        if (getItemViewType(i17) == 103) {
            ((lr.y0) holder).f320613f = this.f2385p;
        }
        if (getItemViewType(i17) == 102) {
            ((lr.y0) holder).f320613f = this.f2385p;
        }
        if (i17 > this.f2386q) {
            this.f2386q = i17;
        }
        super.onBindViewHolder(holder, i17);
    }
}
