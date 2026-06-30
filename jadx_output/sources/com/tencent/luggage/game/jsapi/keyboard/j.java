package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class j implements u81.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ie.d f47226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.game.widget.input.WAGamePanelInputEditText f47227e;

    public j(com.tencent.luggage.game.jsapi.keyboard.r rVar, ie.d dVar, com.tencent.luggage.game.widget.input.WAGamePanelInputEditText wAGamePanelInputEditText) {
        this.f47226d = dVar;
        this.f47227e = wAGamePanelInputEditText;
    }

    @Override // u81.f
    public void D(java.lang.String str, u81.b bVar) {
        if (u81.b.DESTROYED == bVar) {
            ie.d dVar = this.f47226d;
            if (dVar.getAttachedEditText() == this.f47227e) {
                dVar.z();
            }
        }
    }
}
