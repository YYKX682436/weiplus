package pp1;

/* loaded from: classes14.dex */
public final class r implements rp1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pp1.z f438970a;

    public r(pp1.z zVar) {
        this.f438970a = zVar;
    }

    public void a(float f17, float f18, boolean z17, boolean z18) {
        boolean z19 = pp1.z.B;
        boolean z27 = pp1.z.B;
        pp1.z zVar = this.f438970a;
        zVar.getClass();
        if (pp1.z.B) {
            if (z18) {
                int i17 = (int) f17;
                pp1.a0.b(this.f438970a, true, i17, null, null, true, false, false, 96, null);
                zVar.A = i17 - zVar.f438982g;
            } else if (z17) {
                int i18 = (int) f17;
                pp1.a0.a(this.f438970a, false, i18, null, null, true, false, false, 96, null);
                zVar.A = i18 - zVar.f438982g;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
            if (c12917x19ac03e7 != null) {
                if (z18) {
                    zVar.f438983h = ((float) (-zVar.A)) >= ((float) c12917x19ac03e7.getMeasuredWidth()) * 0.3f;
                } else if (z17) {
                    zVar.f438983h = ((float) zVar.A) >= ((float) c12917x19ac03e7.getMeasuredWidth()) * 0.3f;
                }
                int i19 = zVar.A;
            }
        }
    }

    public void b(boolean z17, boolean z18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        pp1.z zVar = this.f438970a;
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec6 = zVar.f438979d;
            java.lang.Object layoutManager = c12916x4253bec6 != null ? c12916x4253bec6.getLayoutManager() : null;
            c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
            if (c1162x665295de == null) {
                return;
            }
            zVar.f438995w = c1162x665295de.w();
            android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(zVar.f438995w);
            if (mo7935xa188593e == null) {
                return;
            }
            mo7935xa188593e.getLeft();
            zVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e7 = zVar.f438981f;
            zVar.f438998z = c12917x19ac03e7 != null ? c12917x19ac03e7.m(false) : 0;
        } else if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12916x4253bec6 c12916x4253bec62 = zVar.f438979d;
            java.lang.Object layoutManager2 = c12916x4253bec62 != null ? c12916x4253bec62.getLayoutManager() : null;
            c1162x665295de = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
            if (c1162x665295de == null) {
                return;
            }
            zVar.f438996x = c1162x665295de.y();
            android.view.View mo7935xa188593e2 = c1162x665295de.mo7935xa188593e(zVar.f438996x);
            if (mo7935xa188593e2 == null) {
                return;
            }
            mo7935xa188593e2.getRight();
            zVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12917x19ac03e7 c12917x19ac03e72 = zVar.f438981f;
            zVar.f438997y = c12917x19ac03e72 != null ? c12917x19ac03e72.n(false) : 0;
        }
        zVar.h();
    }
}
