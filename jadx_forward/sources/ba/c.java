package ba;

/* loaded from: classes14.dex */
public class c extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c f100172e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c2) {
        super(c2694x20086c2);
        this.f100172e = c2694x20086c;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: getVirtualViewAt */
    public int mo7249xde3240ed(float f17, float f18) {
        android.graphics.RectF m20135xd79313f9;
        android.graphics.Rect rect = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.f125997u;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c = this.f100172e;
        if (c2694x20086c.c()) {
            m20135xd79313f9 = c2694x20086c.m20135xd79313f9();
            if (m20135xd79313f9.contains(f17, f18)) {
                return 0;
            }
        }
        return -1;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: getVisibleVirtualViews */
    public void mo7250x3082c07f(java.util.List list) {
        android.graphics.Rect rect = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.f125997u;
        if (this.f100172e.c()) {
            list.add(0);
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: onPerformActionForVirtualView */
    public boolean mo7256x6c00bf3f(int i17, int i18, android.os.Bundle bundle) {
        if (i18 == 16 && i17 == 0) {
            return this.f100172e.e();
        }
        return false;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: onPopulateNodeForHost */
    public void mo7259xe546ae06(o3.l lVar) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c = this.f100172e;
        ba.f fVar = c2694x20086c.f125999e;
        lVar.m(fVar != null && fVar.f100201z);
        lVar.n(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.class.getName());
        lVar.v(c2694x20086c.getText());
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.d
    /* renamed from: onPopulateNodeForVirtualView */
    public void mo7260xeb1f1232(int i17, o3.l lVar) {
        android.graphics.Rect m20136xa4a25d36;
        android.graphics.Rect rect = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.f125997u;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c c2694x20086c = this.f100172e;
        if (!c2694x20086c.c()) {
            lVar.p("");
            lVar.k(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p252x2e944c.C2694x20086c.f125997u);
            return;
        }
        java.lang.CharSequence m20156x6f5780fe = c2694x20086c.m20156x6f5780fe();
        if (m20156x6f5780fe != null) {
            lVar.p(m20156x6f5780fe);
        } else {
            java.lang.CharSequence text = c2694x20086c.getText();
            android.content.Context context = c2694x20086c.getContext();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = android.text.TextUtils.isEmpty(text) ? "" : text;
            lVar.p(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h0d, objArr).trim());
        }
        m20136xa4a25d36 = c2694x20086c.m20136xa4a25d36();
        lVar.k(m20136xa4a25d36);
        lVar.b(o3.f.f424158g);
        lVar.q(c2694x20086c.isEnabled());
    }
}
