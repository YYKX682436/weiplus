package kr;

/* loaded from: classes15.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 f392827d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38) {
        super(0);
        this.f392827d = c10440xb448ef38;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p679x5c28046.p681x6580a04.C10440xb448ef38 c10440xb448ef38 = this.f392827d;
        ir.h config = c10440xb448ef38.getConfig();
        if (config != null) {
            boolean z17 = config.f375391q;
            android.widget.Button button = c10440xb448ef38.f146455y;
            if (z17) {
                button.setVisibility(0);
                button.setEnabled(config.f375392r);
            } else {
                button.setVisibility(8);
            }
            c10440xb448ef38.f146454x.setEnabled(config.f375392r);
            boolean z18 = config.f375392r;
            android.widget.ImageView imageView = c10440xb448ef38.f146453w;
            if (z18) {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f80095xc17ce23a, imageView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            } else {
                rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f80095xc17ce23a, -3355444);
            }
            if (!config.f375392r) {
                kr.i iVar = c10440xb448ef38.B;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = iVar.f392831d;
                if (b4Var != null) {
                    b4Var.d();
                }
                iVar.f392831d = null;
            }
            if (config.f375390p.length() > 0) {
                button.setText(config.f375390p);
            }
        }
        return jz5.f0.f384359a;
    }
}
