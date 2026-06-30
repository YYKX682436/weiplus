package l20;

/* loaded from: classes9.dex */
public final class k implements r00.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b f396693a;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b) {
        this.f396693a = c10547x7c1a666b;
    }

    @Override // r00.h
    public void a(r00.a aVar) {
        if (aVar != null) {
            int i17 = aVar.f449529a | (-16777216);
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b = this.f396693a;
            c10547x7c1a666b.getBgNavi().setBackgroundColor(i17);
            c10547x7c1a666b.getBgNaviCart().setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i17, 16777215 & i17}));
        }
    }
}
