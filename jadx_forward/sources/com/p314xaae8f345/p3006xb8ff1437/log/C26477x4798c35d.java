package com.p314xaae8f345.p3006xb8ff1437.log;

/* renamed from: com.tencent.thumbplayer.log.TPBaseLogger */
/* loaded from: classes16.dex */
public class C26477x4798c35d implements com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675 {

    /* renamed from: mTPLoggerContext */
    private com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 f53976xd01bfcd6;

    /* renamed from: mTag */
    private java.lang.String f53977x32d3ed;

    public C26477x4798c35d(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        this.f53976xd01bfcd6 = c26478xc50084e3;
        this.f53977x32d3ed = c26478xc50084e3.m103238xb5887064();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: debug */
    public void mo103225x5b09653(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.d(this.f53976xd01bfcd6.m103238xb5887064(), str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: error */
    public void mo100756x5c4d208(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f53976xd01bfcd6.m103238xb5887064(), str);
    }

    /* renamed from: getTPLoggerContext */
    public com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 m103231xe4cf9ecd() {
        return this.f53976xd01bfcd6;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: getTag */
    public java.lang.String mo103226xb5887064() {
        return this.f53976xd01bfcd6.m103238xb5887064();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: info */
    public void mo100757x3164ae(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(this.f53976xd01bfcd6.m103238xb5887064(), str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: printException */
    public void mo103227xaa8bf022(java.lang.Exception exc) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f53976xd01bfcd6.m103238xb5887064(), exc);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: updateContext */
    public void mo103228xdf8cd0a6(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3) {
        if (c26478xc50084e3 == null) {
            this.f53976xd01bfcd6 = new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(this.f53977x32d3ed);
        } else {
            this.f53976xd01bfcd6 = c26478xc50084e3;
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: updateTaskId */
    public void mo103229xc89e9ba9(java.lang.String str) {
        this.f53976xd01bfcd6.m103240x23cb4882(str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: verbose */
    public void mo103230x14ed7982(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.v(this.f53976xd01bfcd6.m103238xb5887064(), str);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.log.InterfaceC26476x6d55c675
    /* renamed from: warn */
    public void mo100758x379286(java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.w(this.f53976xd01bfcd6.m103238xb5887064(), str);
    }

    public C26477x4798c35d(com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e3, java.lang.String str) {
        com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3 c26478xc50084e32 = new com.p314xaae8f345.p3006xb8ff1437.log.C26478xc50084e3(c26478xc50084e3, str);
        this.f53976xd01bfcd6 = c26478xc50084e32;
        this.f53977x32d3ed = c26478xc50084e32.m103238xb5887064();
    }
}
