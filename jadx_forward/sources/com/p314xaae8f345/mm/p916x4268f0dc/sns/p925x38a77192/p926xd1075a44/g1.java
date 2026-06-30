package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes14.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f151496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f151497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p012xc85e97e9.p093xedfae76a.y yVar, yz5.p pVar) {
        super(1);
        this.f151496d = yVar;
        this.f151497e = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        final yz5.p pVar = this.f151497e;
        p012xc85e97e9.p093xedfae76a.v vVar = new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.mj_template.sns.compose.widget.MusicSearchPanelKt$ComposableLifecycle$1$observer$1
            @Override // p012xc85e97e9.p093xedfae76a.v
            /* renamed from: onStateChanged */
            public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                yz5.p.this.mo149xb9724478(source, event);
            }
        };
        p012xc85e97e9.p093xedfae76a.y yVar = this.f151496d;
        yVar.mo273xed6858b4().a(vVar);
        return new com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.f1(yVar, vVar);
    }
}
