package com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0;

/* renamed from: com.tencent.thumbplayer.tplayer.plugins.TPPluginManager */
/* loaded from: classes15.dex */
public class C26527x371857de implements com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26526x89b09c75 {

    /* renamed from: mPluginList */
    private java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09> f54467xc51cbabe = new java.util.concurrent.CopyOnWriteArrayList<>();

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26526x89b09c75
    /* renamed from: addPlugin */
    public void mo103644xfa7f1734(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09 interfaceC26525x70d6ef09) {
        java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09> copyOnWriteArrayList = this.f54467xc51cbabe;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.contains(interfaceC26525x70d6ef09)) {
            return;
        }
        interfaceC26525x70d6ef09.mo103279x3b13c504();
        this.f54467xc51cbabe.add(interfaceC26525x70d6ef09);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onAttach */
    public void mo103279x3b13c504() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onDetach */
    public void mo103280x3f5eee52() {
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09
    /* renamed from: onEvent */
    public void mo103281xaf8c47fb(int i17, int i18, int i19, java.lang.String str, java.lang.Object obj) {
        java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09> copyOnWriteArrayList = this.f54467xc51cbabe;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09 next = it.next();
                if (next != null) {
                    next.mo103281xaf8c47fb(i17, i18, i19, str, obj);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26526x89b09c75
    /* renamed from: release */
    public void mo103645x41012807() {
        java.util.concurrent.CopyOnWriteArrayList<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09> copyOnWriteArrayList = this.f54467xc51cbabe;
        if (copyOnWriteArrayList != null) {
            java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09 next = it.next();
                if (next != null) {
                    next.mo103280x3f5eee52();
                }
            }
            this.f54467xc51cbabe.clear();
        }
        this.f54467xc51cbabe = null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26526x89b09c75
    /* renamed from: removePlugin */
    public void mo103646xc793e0d7(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.InterfaceC26525x70d6ef09 interfaceC26525x70d6ef09) {
        if (this.f54467xc51cbabe != null) {
            interfaceC26525x70d6ef09.mo103280x3f5eee52();
            this.f54467xc51cbabe.remove(interfaceC26525x70d6ef09);
        }
    }
}
