package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class yd extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 f211589e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f211590f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f211591g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f211592h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f211593i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949, java.util.LinkedList linkedList, r45.mb4 mb4Var, android.graphics.Canvas canvas, android.graphics.Bitmap bitmap) {
        super(2);
        this.f211588d = i17;
        this.f211589e = activityC15059x3e98c949;
        this.f211590f = linkedList;
        this.f211591g = mb4Var;
        this.f211592h = canvas;
        this.f211593i = bitmap;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int indexOf;
        r45.c07 c07Var;
        r45.c07 c07Var2;
        r45.c07 c07Var3;
        r45.c07 c07Var4;
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949 activityC15059x3e98c949 = this.f211589e;
        int i17 = activityC15059x3e98c949.W1;
        int i18 = this.f211588d;
        if (i18 == i17 && (indexOf = this.f211590f.indexOf(java.lang.Long.valueOf(longValue))) >= 0 && bitmap != null) {
            float m76 = activityC15059x3e98c949.m7();
            int l76 = (int) activityC15059x3e98c949.l7();
            r45.mb4 mb4Var = this.f211591g;
            boolean m75933x41a8a7f2 = mb4Var.m75933x41a8a7f2(13);
            android.graphics.Canvas canvas = this.f211592h;
            if (m75933x41a8a7f2) {
                r45.dd4 dd4Var = (r45.dd4) mb4Var.m75936x14adae67(14);
                canvas.drawBitmap(bitmap, activityC15059x3e98c949.f7((dd4Var == null || (c07Var4 = (r45.c07) dd4Var.m75936x14adae67(6)) == null) ? 0 : c07Var4.m75939xb282bd08(0), (dd4Var == null || (c07Var3 = (r45.c07) dd4Var.m75936x14adae67(6)) == null) ? 0 : c07Var3.m75939xb282bd08(3), (dd4Var == null || (c07Var2 = (r45.c07) dd4Var.m75936x14adae67(6)) == null) ? 0 : c07Var2.m75939xb282bd08(2), (dd4Var == null || (c07Var = (r45.c07) dd4Var.m75936x14adae67(6)) == null) ? 0 : c07Var.m75939xb282bd08(1), (int) m76, l76), new android.graphics.Rect((int) (indexOf * m76), 0, (int) ((indexOf + 1) * m76), l76), (android.graphics.Paint) null);
            } else {
                canvas.drawBitmap(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, (int) m76, l76, false), indexOf * ((float) java.lang.Math.floor(m76)), 0.0f, (android.graphics.Paint) null);
            }
            activityC15059x3e98c949.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xd(i18, activityC15059x3e98c949, this.f211593i));
        }
        return jz5.f0.f384359a;
    }
}
