package com.tencent.mm.plugin.collect.model.voice;

/* loaded from: classes15.dex */
public class n extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.model.voice.p f96190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.collect.model.voice.p pVar, java.lang.String str) {
        super(str);
        this.f96190a = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.collect.model.voice.p pVar = this.f96190a;
        com.tencent.mm.plugin.collect.model.voice.q qVar = pVar.f96192a;
        if (qVar != null) {
            int i17 = message.what;
            if (i17 == -1) {
                ((com.tencent.mm.plugin.collect.model.voice.j) qVar).a(-203, null);
            } else {
                if (i17 != 0) {
                    return;
                }
                ((com.tencent.mm.plugin.collect.model.voice.j) pVar.f96192a).a(0, message.getData().getByteArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            }
        }
    }
}
