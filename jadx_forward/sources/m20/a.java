package m20;

/* loaded from: classes11.dex */
public final class a implements com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23645x80ccca4a {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f404498a;

    @Override // com.p314xaae8f345.p2845xc516c4b6.ecs.InterfaceC23645x80ccca4a
    /* renamed from: onClickFeedback */
    public void mo87623x29eaf18e(double d17, double d18, double d19, double d27) {
        android.graphics.Rect rect = new android.graphics.Rect((int) d17, (int) d18, (int) (d17 + d19), (int) (d18 + d27));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsFinderFeedNativeApiImpl", "onClickFeedback: rect=" + rect);
        yz5.l lVar = this.f404498a;
        if (lVar != null) {
            lVar.mo146xb9724478(rect);
        }
    }
}
