package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb;

/* renamed from: com.tencent.qqmusic.mediaplayer.upstream.ListPlayerListenerCallback */
/* loaded from: classes13.dex */
public class C25443x2591e078 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a {

    /* renamed from: mCallbacks */
    private final java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> f46143x3c7f32e1 = new java.util.concurrent.CopyOnWriteArrayList<>();

    public synchronized void add(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a) {
        this.f46143x3c7f32e1.add(interfaceC25343x8e10fe3a);
    }

    /* renamed from: addAll */
    public synchronized void m94311xab35b940(java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> list) {
        this.f46143x3c7f32e1.addAll(list);
    }

    /* renamed from: clear */
    public synchronized void m94312x5a5b64d() {
        this.f46143x3c7f32e1.clear();
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onBufferingUpdate */
    public void mo93843x3e084f2c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93843x3e084f2c(abstractC25320x37471834, i17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onCompletion */
    public void mo93844xa6db431b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93844xa6db431b(abstractC25320x37471834);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onError */
    public void mo93845xaf8aa769(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17, int i18, int i19) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93845xaf8aa769(abstractC25320x37471834, i17, i18, i19);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onPrepared */
    public void mo93846x58d5b73c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93846x58d5b73c(abstractC25320x37471834);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onSeekComplete */
    public void mo93847xe1fdf750(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93847xe1fdf750(abstractC25320x37471834, i17);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStarted */
    public void mo93848xde9141a2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93848xde9141a2(abstractC25320x37471834);
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStateChanged */
    public void mo93849xaba1ac62(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        java.util.Iterator<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> it = this.f46143x3c7f32e1.iterator();
        while (it.hasNext()) {
            it.next().mo93849xaba1ac62(abstractC25320x37471834, i17);
        }
    }

    /* renamed from: remove */
    public synchronized void m94313xc84af884(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a interfaceC25343x8e10fe3a) {
        this.f46143x3c7f32e1.remove(interfaceC25343x8e10fe3a);
    }

    /* renamed from: toCollection */
    public synchronized java.util.List<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a> m94314x1aaffb79() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f46143x3c7f32e1);
        return arrayList;
    }

    public synchronized void add(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2914x6978bddb.C25443x2591e078 c25443x2591e078) {
        this.f46143x3c7f32e1.addAll(c25443x2591e078.m94314x1aaffb79());
    }
}
