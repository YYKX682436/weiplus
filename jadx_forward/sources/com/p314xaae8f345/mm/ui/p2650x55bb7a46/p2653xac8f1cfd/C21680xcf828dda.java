package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.ui.chatting.component.VoiceComponent$3 */
/* loaded from: classes9.dex */
public class C21680xcf828dda extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro f280110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21680xcf828dda(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar, p012xc85e97e9.p093xedfae76a.y yVar) {
        super(yVar);
        this.f280110d = roVar;
        this.f39173x3fe91575 = -1397503360;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe90) {
        java.lang.Object valueOf;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6220x84bdfe90 c6220x84bdfe902 = c6220x84bdfe90;
        if (c6220x84bdfe902 != null) {
            if (this.f280110d.f281404n.containsKey(java.lang.Long.valueOf(c6220x84bdfe902.f136469g.f89123a))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "voice msg(%s) download finish, success:%s, isReDownload:%s", java.lang.Long.valueOf(c6220x84bdfe902.f136469g.f89123a), java.lang.Boolean.valueOf(c6220x84bdfe902.f136469g.f89124b), java.lang.Boolean.valueOf(c6220x84bdfe902.f136469g.f89125c));
                this.f280110d.f281404n.put(java.lang.Long.valueOf(c6220x84bdfe902.f136469g.f89123a), java.lang.Boolean.FALSE);
                am.p00 p00Var = c6220x84bdfe902.f136469g;
                boolean z17 = false;
                if (p00Var.f89124b && !p00Var.f89125c) {
                    long j17 = p00Var.f89123a;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ro roVar = this.f280110d;
                    long j18 = roVar.f281402i;
                    if (j17 == j18 && roVar.f281401h) {
                        java.lang.ref.WeakReference weakReference = roVar.f281403m;
                        if (weakReference == null || weakReference.get() == null) {
                            java.lang.Object[] objArr = new java.lang.Object[2];
                            objArr[0] = java.lang.Boolean.valueOf(this.f280110d.f281403m == null);
                            java.lang.ref.WeakReference weakReference2 = this.f280110d.f281403m;
                            if (weakReference2 == null) {
                                valueOf = "null";
                            } else {
                                valueOf = java.lang.Boolean.valueOf(weakReference2.get() == null);
                            }
                            objArr[1] = valueOf;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VoiceComponent", "autoPlayDownloadView:%s view:%s", objArr);
                        } else {
                            int j19 = this.f280110d.f280113d.j() - this.f280110d.f280113d.m();
                            int o17 = this.f280110d.f280113d.o() - this.f280110d.f280113d.m();
                            sb5.z zVar = (sb5.z) this.f280110d.f280113d.f542241c.a(sb5.z.class);
                            while (true) {
                                if (j19 <= o17) {
                                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 mo75871xfb80e389 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).mo75871xfb80e389(j19);
                                    if (mo75871xfb80e389 != null && mo75871xfb80e389.m124847x74d37ac6() == c6220x84bdfe902.f136469g.f89123a) {
                                        z17 = true;
                                        break;
                                    }
                                    j19++;
                                } else {
                                    break;
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.VoiceComponent", "msgId:%s showInScreen:%s", java.lang.Long.valueOf(c6220x84bdfe902.f136469g.f89123a), java.lang.Boolean.valueOf(z17));
                        }
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.VoiceComponent", "autoPlayDownloadMsgId:%s canAutoPlayDownloadVoice:%s", java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(this.f280110d.f281401h));
                    }
                }
                ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wo(this, z17));
            } else if (c6220x84bdfe902.f136469g.f89124b) {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.VoiceComponent$3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21680xcf828dda.this.f280110d.f280113d.J();
                    }
                });
            }
        }
        return true;
    }
}
