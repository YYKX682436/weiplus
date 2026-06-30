package com.tencent.mm.open_voice_control.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/SelectContactCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "f41/n", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class SelectContactCard extends com.tencent.mm.open_voice_control.card.BaseCard {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f72234p = 0;
    public final jz5.g U1;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f72235e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f72236f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f72237g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f72238h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f72239i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f72240m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f72241n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.a f72242o;

    public SelectContactCard() {
        super(com.tencent.mm.R.layout.dy6);
        this.f72235e = jz5.h.b(new f41.z(this));
        this.f72236f = jz5.h.b(new f41.x(this));
        this.f72237g = jz5.h.b(new f41.o(this));
        this.f72238h = jz5.h.b(new f41.w(this));
        this.f72239i = jz5.h.b(new f41.q(this));
        this.f72240m = jz5.h.b(new f41.y(this));
        this.U1 = jz5.h.b(new r.i(this));
        this.f72241n = jz5.h.b(new f41.p(this));
    }

    public final com.tencent.mm.view.MaxHeightFrameLayout c() {
        return (com.tencent.mm.view.MaxHeightFrameLayout) ((jz5.n) this.U1).getValue();
    }

    /* JADX WARN: Type inference failed for: r1v20, types: [com.tencent.mm.open_voice_control.card.SelectContactCard$initView$adapter$2] */
    @Override // com.tencent.mm.open_voice_control.card.BaseCard
    public void l0() {
        int i17;
        com.tencent.wechat.aff.ovc.l lVar;
        int ordinal = ((f41.n) ((jz5.n) this.f72236f).getValue()).ordinal();
        if (ordinal == 0) {
            i17 = com.tencent.mm.R.string.pgg;
        } else if (ordinal == 1) {
            i17 = com.tencent.mm.R.string.pgd;
        } else {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            i17 = com.tencent.mm.R.string.pge;
        }
        ((android.widget.TextView) ((jz5.n) this.f72240m).getValue()).setText(i17);
        ((android.view.View) ((jz5.n) this.f72237g).getValue()).setOnClickListener(new f41.r(this));
        ((android.view.View) ((jz5.n) this.f72238h).getValue()).setOnClickListener(new f41.s(this));
        jz5.g gVar = this.f72239i;
        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(f41.t.f259514d);
        jz5.g gVar2 = this.f72241n;
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        int min = (int) ((548 * (java.lang.Math.min(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) / 400.0f)) + 0.5f);
        c().setMaxHeight(min);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        f0Var.f310116d = -1;
        ((android.view.View) ((jz5.n) gVar).getValue()).getViewTreeObserver().addOnPreDrawListener(new r.j(this, min, f0Var));
        ?? r17 = new in5.s() { // from class: com.tencent.mm.open_voice_control.card.SelectContactCard$initView$adapter$2
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new f41.d();
            }
        };
        android.os.Bundle arguments = getArguments();
        java.lang.String[] stringArray = arguments != null ? arguments.getStringArray("usernames") : null;
        if (stringArray == null) {
            stringArray = new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(stringArray.length);
        for (java.lang.String str : stringArray) {
            arrayList.add(new f41.r0(str));
        }
        f41.v vVar = new f41.v(r17, new java.util.ArrayList(arrayList));
        ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar2).getValue()).setAdapter(vVar);
        vVar.B = new com.tencent.mm.open_voice_control.card.SelectContactCard$initView$4();
        s.l lVar2 = h41.y0.f278893k;
        jz5.g gVar3 = this.f72235e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar3).getValue()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = h41.y0.f278892f;
        java.util.Set keySet = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", sb6.toString());
        h41.y0 y0Var = (h41.y0) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (y0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            dismiss();
        } else if (y0Var.f278901j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "onCardCreated: already released, dismiss card");
            dismiss();
            lVar2.a(y0Var.f278897d);
            y0Var.f278897d = 0;
        } else {
            y0Var.f278899h = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar3).getValue()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", sb7.toString());
        h41.y0 y0Var2 = (h41.y0) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (y0Var2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            dismiss();
            return;
        }
        if (y0Var2.f278901j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "attach: already released, dismiss card");
            this.f72242o = null;
            dismiss();
            lVar2.a(y0Var2.f278897d);
            y0Var2.f278897d = 0;
            return;
        }
        if (y0Var2.f278896c <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = y0Var2.f278895b == null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + y0Var2.f278896c);
        y0Var2.f278899h = null;
        y0Var2.f278895b = this;
        this.f72242o = new h41.u0(y0Var2);
        if (!z17 || (lVar = y0Var2.f278894a) == null) {
            return;
        }
        lVar.c(y0Var2.f278896c);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        s.l lVar = h41.y0.f278893k;
        int intValue = ((java.lang.Number) ((jz5.n) this.f72235e).getValue()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", "detach: " + intValue);
        h41.y0 y0Var = (h41.y0) h41.y0.f278892f.get(java.lang.Integer.valueOf(intValue));
        if (y0Var != null) {
            if (y0Var.f278895b == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", "detach: clear card reference");
                y0Var.f278895b = null;
            }
            if (y0Var.f278899h == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", "detach: clear pending card reference");
                y0Var.f278899h = null;
            }
            this.f72242o = null;
        }
        super.onDestroyView();
    }
}
