package c61;

/* loaded from: classes3.dex */
public final class c8 implements c61.dc {
    @Override // c61.dc
    public void a(android.view.View clickedRootView, androidx.appcompat.app.AppCompatActivity contextActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(clickedRootView, "clickedRootView");
        kotlin.jvm.internal.o.g(contextActivity, "contextActivity");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        b(clickedRootView, contextActivity, new zy2.nc(feed.getFeedObject().getUserName(), feed.getFeedObject().getId(), feed.getFeedObject().getObjectNonceId(), feed.getFeedObject().getLiveInfo(), feed.g0(), feed.getFeedObject().getNickName(), null, null, 192, null), scene, onAnimationEndCallback);
    }

    @Override // c61.dc
    public void b(android.view.View clickedRootView, androidx.appcompat.app.AppCompatActivity contextActivity, zy2.nc feedData, ez2.a scene, yz5.p onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(clickedRootView, "clickedRootView");
        kotlin.jvm.internal.o.g(contextActivity, "contextActivity");
        kotlin.jvm.internal.o.g(feedData, "feedData");
        kotlin.jvm.internal.o.g(scene, "scene");
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Kk()) {
            c(clickedRootView, contextActivity, feedData, scene, onAnimationEndCallback);
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        c61.z7 z7Var = new c61.z7(this, clickedRootView, contextActivity, feedData, scene, onAnimationEndCallback);
        ((vd0.j2) q1Var).getClass();
        v24.o0.h(contextActivity, 9007199254740992L, null, z7Var, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r49, androidx.appcompat.app.AppCompatActivity r50, zy2.nc r51, ez2.a r52, yz5.p r53) {
        /*
            Method dump skipped, instructions count: 2081
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.c8.c(android.view.View, androidx.appcompat.app.AppCompatActivity, zy2.nc, ez2.a, yz5.p):void");
    }
}
