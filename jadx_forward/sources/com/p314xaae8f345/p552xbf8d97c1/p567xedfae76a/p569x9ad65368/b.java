package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368;

/* loaded from: classes12.dex */
public final class b implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f134354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f134355e;

    public b(java.util.Map.Entry entry, yz5.p pVar) {
        this.f134354d = entry;
        this.f134355e = pVar;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void off() {
        this.f134355e.mo149xb9724478(this.f134354d.getKey(), java.lang.Boolean.FALSE);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k
    public void on() {
        this.f134355e.mo149xb9724478(this.f134354d.getKey(), java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j
    /* renamed from: serial */
    public boolean mo40995xca01fdf4() {
        return true;
    }
}
