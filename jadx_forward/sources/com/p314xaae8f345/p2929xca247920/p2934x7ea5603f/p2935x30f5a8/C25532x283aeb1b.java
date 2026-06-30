package com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8;

/* renamed from: com.tencent.shadow.dynamic.host.DynamicPluginManager */
/* loaded from: classes16.dex */
public final class C25532x283aeb1b implements com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25550x25ca78da {

    /* renamed from: mFile */
    private java.io.File f46674x6216b89;

    /* renamed from: mManagerImpl */
    private com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a f46675xac5f58c0;

    public C25532x283aeb1b(java.io.File file) {
        this.f46674x6216b89 = file;
    }

    /* renamed from: exit */
    public void m95544x2fb91e() {
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a interfaceC25551xd7f1521a = this.f46675xac5f58c0;
        if (interfaceC25551xd7f1521a != null) {
            interfaceC25551xd7f1521a.m95597xac79a11b();
        }
    }

    /* renamed from: getFile */
    public java.io.File m95545xfb7f5df2() {
        return this.f46674x6216b89;
    }

    /* renamed from: isValid */
    public boolean m95546x7b953cf2() {
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a interfaceC25551xd7f1521a = this.f46675xac5f58c0;
        if (interfaceC25551xd7f1521a == null) {
            return false;
        }
        return interfaceC25551xd7f1521a.m95595x7b953cf2();
    }

    /* renamed from: loadManagerIfNeeded */
    public void m95547x3c5ff839(android.content.Context context) {
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a interfaceC25551xd7f1521a = this.f46675xac5f58c0;
        if (interfaceC25551xd7f1521a != null) {
            interfaceC25551xd7f1521a.m95596x3e5a77bb(null);
            return;
        }
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a m95592x32c4e6 = new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25547x50069dc0(context, this.f46674x6216b89).m95592x32c4e6();
        m95592x32c4e6.m95596x3e5a77bb(null);
        this.f46675xac5f58c0 = m95592x32c4e6;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25550x25ca78da
    /* renamed from: process */
    public void mo95548xed8d1e6f(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map, com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25534x7050631d interfaceC25534x7050631d) {
        com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.InterfaceC25551xd7f1521a interfaceC25551xd7f1521a = this.f46675xac5f58c0;
        if (interfaceC25551xd7f1521a == null) {
            interfaceC25534x7050631d.mo95561x815f5438(new com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25535x8b1186b6(1008, "mManagerImpl is null"), null);
        } else {
            interfaceC25551xd7f1521a.mo95548xed8d1e6f(context, str, map, interfaceC25534x7050631d);
        }
    }
}
