package cc1;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f121988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str) {
        super(0);
        this.f121988d = lVar;
        this.f121989e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = this.f121988d.mo50358x95c7fa5f();
        if (mo50358x95c7fa5f != null && (mo273xed6858b4 = mo50358x95c7fa5f.mo273xed6858b4()) != null) {
            final java.lang.String str = this.f121989e;
            mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.appbrand.jsapi.crypto.JsApiCryptoOpen$invoke$manager$1$1$1
                @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
                /* renamed from: onDestroyed */
                public final void m50885x7495d2fa() {
                    cc1.h hVar = cc1.i.f121961b;
                    java.lang.String appId = str;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "$appId");
                    java.util.concurrent.locks.ReentrantLock reentrantLock = cc1.i.f121962c;
                    reentrantLock.lock();
                    try {
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            });
        }
        return jz5.f0.f384359a;
    }
}
