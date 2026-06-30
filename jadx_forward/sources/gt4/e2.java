package gt4;

/* loaded from: classes12.dex */
public class e2 implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f356959a;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f356959a = c19151x10374577;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577;
        a36.i iVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSuccPageAwardWidget", "load background_img finish, url: %s, bitmap: %s", str, bitmap);
        if (bitmap == null || (iVar = (c19151x10374577 = this.f356959a).f262275q) == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(iVar.f82685g) || !c19151x10374577.f262275q.f82685g.equals(str)) {
            return;
        }
        c19151x10374577.getClass();
        int[] iArr = {(bitmap.getWidth() / 2) - 3, (bitmap.getWidth() / 2) + 3};
        int[] iArr2 = {(bitmap.getHeight() / 2) - 3, (bitmap.getHeight() / 2) + 3};
        java.nio.ByteBuffer order = java.nio.ByteBuffer.allocate(84).order(java.nio.ByteOrder.nativeOrder());
        order.put((byte) 1);
        order.put((byte) 2);
        order.put((byte) 2);
        order.put((byte) 9);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(0);
        order.putInt(iArr[0]);
        order.putInt(iArr[1]);
        order.putInt(iArr2[0]);
        order.putInt(iArr2[1]);
        for (int i17 = 0; i17 < 9; i17++) {
            order.putInt(1);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new gt4.d2(this, new android.graphics.drawable.NinePatchDrawable(c19151x10374577.getResources(), new android.graphics.NinePatch(bitmap, order.array(), "widget_bg"))));
    }
}
