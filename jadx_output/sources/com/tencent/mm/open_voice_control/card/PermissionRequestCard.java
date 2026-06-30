package com.tencent.mm.open_voice_control.card;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/PermissionRequestCard;", "Lcom/tencent/mm/open_voice_control/card/BaseCard;", "<init>", "()V", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PermissionRequestCard extends com.tencent.mm.open_voice_control.card.BaseCard {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f72226o = 0;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f72227e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f72228f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f72229g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f72230h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f72231i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f72232m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.a f72233n;

    public PermissionRequestCard() {
        super(com.tencent.mm.R.layout.f487862dy5);
        this.f72227e = jz5.h.b(new f41.m(this));
        this.f72228f = jz5.h.b(new f41.l(this));
        this.f72229g = jz5.h.b(new f41.g(this));
        this.f72230h = jz5.h.b(new f41.f(this));
        this.f72231i = jz5.h.b(new f41.e(this));
    }

    @Override // com.tencent.mm.open_voice_control.card.BaseCard
    public void l0() {
        com.tencent.wechat.aff.ovc.j jVar;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cut);
        android.widget.TextView textView = findViewById instanceof android.widget.TextView ? (android.widget.TextView) findViewById : null;
        if (textView != null) {
            textView.setText(getString(com.tencent.mm.R.string.pgb));
        }
        ((android.view.View) ((jz5.n) this.f72228f).getValue()).setOnClickListener(f41.h.f259483d);
        ((android.view.View) ((jz5.n) this.f72229g).getValue()).setOnClickListener(f41.i.f259485d);
        ((android.view.View) ((jz5.n) this.f72230h).getValue()).setOnClickListener(new f41.j(this));
        ((android.view.View) ((jz5.n) this.f72231i).getValue()).setOnClickListener(new f41.k(this));
        s.k kVar = h41.t0.f278860k;
        jz5.g gVar = this.f72227e;
        int intValue = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCardCreated: ");
        sb6.append(intValue);
        sb6.append(" uis ");
        java.util.HashMap hashMap = h41.t0.f278859f;
        java.util.Set keySet = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        sb6.append(kz5.n0.g0(keySet, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", sb6.toString());
        h41.t0 t0Var = (h41.t0) hashMap.get(java.lang.Integer.valueOf(intValue));
        if (t0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "onCardCreated: ui not found, dismiss orphan card id=" + intValue);
            dismiss();
        } else if (t0Var.f278868j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "onCardCreated: already released, dismiss card");
            dismiss();
            kVar.a(t0Var.f278864d);
            t0Var.f278864d = 0;
        } else {
            t0Var.f278866h = this;
        }
        int intValue2 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("attach: ");
        sb7.append(intValue2);
        sb7.append(" uis ");
        java.util.Set keySet2 = hashMap.keySet();
        kotlin.jvm.internal.o.f(keySet2, "<get-keys>(...)");
        sb7.append(kz5.n0.g0(keySet2, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", sb7.toString());
        h41.t0 t0Var2 = (h41.t0) hashMap.get(java.lang.Integer.valueOf(intValue2));
        if (t0Var2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "attach: ui not found, dismiss orphan card id=" + intValue2);
            dismiss();
            return;
        }
        if (t0Var2.f278868j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "attach: already released, dismiss card");
            this.f72233n = null;
            this.f72232m = null;
            dismiss();
            kVar.a(t0Var2.f278864d);
            t0Var2.f278864d = 0;
            return;
        }
        if (t0Var2.f278863c <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "attach: openTaskId invalid");
            return;
        }
        boolean z17 = t0Var2.f278862b == null;
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "attach: isFirstAttach=" + z17 + ", openTaskId=" + t0Var2.f278863c);
        t0Var2.f278866h = null;
        t0Var2.f278862b = this;
        this.f72233n = new h41.p0(t0Var2);
        this.f72232m = new h41.q0(t0Var2);
        if (!z17 || (jVar = t0Var2.f278861a) == null) {
            return;
        }
        jVar.c(t0Var2.f278863c);
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        s.k kVar = h41.t0.f278860k;
        int intValue = ((java.lang.Number) ((jz5.n) this.f72227e).getValue()).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "detach: " + intValue);
        h41.t0 t0Var = (h41.t0) h41.t0.f278859f.get(java.lang.Integer.valueOf(intValue));
        if (t0Var != null) {
            if (t0Var.f278862b == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "detach: clear card reference");
                t0Var.f278862b = null;
            }
            if (t0Var.f278866h == this) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "detach: clear pending card reference");
                t0Var.f278866h = null;
            }
            this.f72233n = null;
            this.f72232m = null;
        }
        super.onDestroyView();
    }
}
