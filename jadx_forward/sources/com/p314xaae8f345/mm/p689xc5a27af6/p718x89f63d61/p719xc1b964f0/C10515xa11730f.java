package com.p314xaae8f345.mm.p689xc5a27af6.p718x89f63d61.p719xc1b964f0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/tencent/mm/feature/checkresupdate/superdownloader/WrapCore$downloadCdnRes$realDownload$2$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/CheckResUpdateCacheFileEvent;", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.checkresupdate.superdownloader.WrapCore$downloadCdnRes$realDownload$2$1 */
/* loaded from: classes.dex */
public final class C10515xa11730f extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f147108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f147109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f147110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f147111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10515xa11730f(int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, com.p314xaae8f345.mm.app.a0 a0Var) {
        super(a0Var);
        this.f147108d = i17;
        this.f147109e = i18;
        this.f147110f = h0Var;
        this.f147111g = h0Var2;
        this.f39173x3fe91575 = 905296653;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd event = c5255x5f3208fd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        am.r2 r2Var = event.f135586g;
        int i17 = r2Var.f89292a;
        int i18 = this.f147108d;
        if (i17 == i18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f147111g;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d) h0Var.f391656d;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48814x2efc64();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadCdnRes resType:");
            sb6.append(i18);
            sb6.append(" subType:");
            int i19 = this.f147109e;
            sb6.append(i19);
            sb6.append(" resEventListener-dead");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", sb6.toString());
            h0Var.f391656d = null;
            int i27 = r2Var.f89293b;
            java.lang.String str = r2Var.f89294c;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Download.SuperDownloaderWrapCore", "#downloadCdnRes-realDownload callback resType:" + i18 + " subType:" + i19 + " subtype" + i27 + ' ' + str + ' ' + r2Var.f89296e);
            boolean z17 = str == null || str.length() == 0;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f147110f;
            if (z17) {
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) h0Var2.f391656d;
                if (interfaceC29045xdcb5ca57 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(java.lang.Boolean.FALSE, "")));
                }
                h0Var2.f391656d = null;
            } else {
                p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) h0Var2.f391656d;
                if (interfaceC29045xdcb5ca572 != null) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    interfaceC29045xdcb5ca572.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new jz5.l(bool, str)));
                }
                h0Var2.f391656d = null;
            }
        }
        return false;
    }
}
