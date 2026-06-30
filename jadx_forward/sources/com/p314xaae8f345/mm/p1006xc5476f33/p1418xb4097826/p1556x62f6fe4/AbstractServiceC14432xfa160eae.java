package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/media/FinderLiveMediaBrowserBaseService;", "Landroidx/media/MediaBrowserServiceCompat;", "Lsn2/g;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserBaseService */
/* loaded from: classes11.dex */
public abstract class AbstractServiceC14432xfa160eae extends p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33 implements sn2.g {
    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33
    public c4.l b(java.lang.String clientPackageName, int i17, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientPackageName, "clientPackageName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "onGetRoot: who is trying to connect me: " + clientPackageName + ": " + i17);
        java.lang.String e17 = e();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGetRoot: connection hint: ");
        sb6.append(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e17, sb6.toString());
        return new c4.l(e(), null);
    }

    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33
    public void c(java.lang.String parentId, c4.z result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentId, "parentId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "onLoadChildren: no need to load children");
        result.d(null);
    }

    public abstract java.lang.String e();
}
