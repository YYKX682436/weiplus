package yi4;

/* loaded from: classes11.dex */
public final class h implements com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f544146d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca
    /* renamed from: closeFromPlatform */
    public void mo92388xcaae9855() {
        android.app.Activity activity;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPlatformApiImpl", "closeFromPlatform: on Android");
        java.lang.ref.WeakReference weakReference = this.f544146d;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca
    /* renamed from: openStatusCardFloatView */
    public void mo92389x9f598c75(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.ref.WeakReference weakReference = this.f544146d;
        if ((weakReference != null ? (android.app.Activity) weakReference.get() : null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusPublishPlatformApiImpl", "openStatusCardFloatView: activity not bound");
            return;
        }
        bi4.h1 h1Var = new bi4.h1(username, 16, 154L, false, false, null, new bi4.i1(0.0f, 0, 3, null), null);
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.ref.WeakReference weakReference2 = this.f544146d;
        ((we0.j1) l0Var).sj(weakReference2 != null ? (android.app.Activity) weakReference2.get() : null, h1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0157  */
    @Override // com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.InterfaceC24944x661ed3ca
    /* renamed from: showPrivacySettings */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo92390x6cfc1f0e(com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24936x156de99 r18, yz5.l r19) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi4.h.mo92390x6cfc1f0e(com.tencent.pigeon.status.StatusPrivacyRequest, yz5.l):void");
    }
}
