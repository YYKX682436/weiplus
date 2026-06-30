package l20;

/* loaded from: classes9.dex */
public final class c0 implements r00.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 f396671a;

    public c0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 c10548x1e09fcd9) {
        this.f396671a = c10548x1e09fcd9;
    }

    @Override // r00.h
    public void a(r00.a aVar) {
        if (aVar != null) {
            int i17 = aVar.f449529a | (-16777216);
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 c10548x1e09fcd9 = this.f396671a;
            c10548x1e09fcd9.getBgNavi().setBackgroundColor(i17);
            c10548x1e09fcd9.getBgNaviCart().setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i17, 16777215 & i17}));
        }
    }
}
