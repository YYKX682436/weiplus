package br1;

/* loaded from: classes11.dex */
public final class h implements br1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ br1.m f23614a;

    public h(br1.m mVar) {
        this.f23614a = mVar;
    }

    @Override // br1.w
    public void a(int i17) {
        br1.m mVar = this.f23614a;
        java.util.Iterator it = mVar.Di().entrySet().iterator();
        while (it.hasNext()) {
            br1.w.c((br1.w) ((java.util.Map.Entry) it.next()).getValue(), false, i17, null, 4, null);
        }
        mVar.Di().clear();
    }

    @Override // br1.w
    public void b(boolean z17, int i17, hr1.a aVar) {
        java.lang.String str = aVar != null ? aVar.field_openid : null;
        if (str == null || str.length() == 0) {
            return;
        }
        br1.m mVar = this.f23614a;
        java.util.concurrent.ConcurrentHashMap Di = mVar.Di();
        kotlin.jvm.internal.o.d(aVar);
        if (Di.contains(aVar.field_openid)) {
            br1.w wVar = (br1.w) mVar.Di().get(aVar.field_openid);
            if (wVar != null) {
                wVar.b(z17, i17, aVar);
            }
            mVar.Di().remove(aVar.field_openid);
        }
        if (z17) {
            mVar.Ri(aVar, i17);
        }
    }
}
