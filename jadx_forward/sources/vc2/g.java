package vc2;

/* loaded from: classes15.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f516775a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f516776b;

    public g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f516775a = layoutManager;
        this.f516776b = c1163xf1deaba4;
    }

    public static boolean b(int i17, int i18, int i19, int i27, int i28, vc2.f fVar) {
        vc2.e eVar = fVar.f516773a;
        int i29 = eVar.f516772b;
        if ((i29 > 0) && fVar.f516774b == i29) {
            return true;
        }
        return eVar.f516771a.ordinal() != 1 ? (i17 + i18) + i28 > i27 : (i17 - i18) - i28 < i19;
    }

    public android.graphics.Point a(vc2.f fVar) {
        int ordinal = fVar.f516773a.f516771a.ordinal();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f516775a;
        return ordinal != 1 ? new android.graphics.Point(this.f516776b.getPaddingLeft(), layoutManager.m8031xf39fff7a()) : new android.graphics.Point(layoutManager.m8037x755bd410() - layoutManager.m8029x8b7f0b01(), layoutManager.m8031xf39fff7a());
    }

    public int c() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = this.f516775a;
        return (layoutManager.m8037x755bd410() - layoutManager.m8029x8b7f0b01()) - this.f516776b.getPaddingLeft();
    }
}
