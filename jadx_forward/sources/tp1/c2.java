package tp1;

/* loaded from: classes13.dex */
public final class c2 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c2() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5801x3757a97e event = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5801x3757a97e) abstractC20979x809547d1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.wm wmVar = event.f136110g;
        if (wmVar == null) {
            return false;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = vp1.b.f520416a;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment = wmVar.f89834a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fragment, "fragment");
        java.lang.String str2 = wmVar.f89835b;
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String str4 = wmVar.f89836c;
        java.lang.String str5 = str4 == null ? "" : str4;
        boolean z17 = wmVar.f89837d;
        long j17 = wmVar.f89838e;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = fragment.mo7430x19263085();
        if (mo7430x19263085 == null || (intent = mo7430x19263085.getIntent()) == null || (str = intent.getStringExtra("key_extra_info")) == null) {
            str = "";
        }
        java.util.Iterator it = vp1.b.f520416a.iterator();
        while (it.hasNext()) {
            up1.b bVar = (up1.b) it.next();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("finder_extraInfo_key", str);
            bVar.v(fragment, str3, str5, z17, intent2, j17);
        }
        return false;
    }
}
