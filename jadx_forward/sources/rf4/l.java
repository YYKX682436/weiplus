package rf4;

/* loaded from: classes4.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd f476613d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd) {
        this.f476613d = c18475x542840cd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.a onLoop = this.f476613d.getOnLoop();
        if (onLoop != null) {
            onLoop.mo152xb9724478();
        }
    }
}
