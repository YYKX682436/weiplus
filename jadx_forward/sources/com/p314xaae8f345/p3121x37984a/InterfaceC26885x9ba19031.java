package com.p314xaae8f345.p3121x37984a;

/* renamed from: com.tencent.wcdb.IBulkCursor */
/* loaded from: classes12.dex */
public interface InterfaceC26885x9ba19031 extends android.os.IInterface {

    /* renamed from: CLOSE_TRANSACTION */
    public static final int f57802x2d92a6d7 = 7;

    /* renamed from: DEACTIVATE_TRANSACTION */
    public static final int f57803x1d6b7373 = 2;

    /* renamed from: GET_CURSOR_WINDOW_TRANSACTION */
    public static final int f57804xed01c4af = 1;

    /* renamed from: GET_EXTRAS_TRANSACTION */
    public static final int f57805x122cb68b = 5;

    /* renamed from: ON_MOVE_TRANSACTION */
    public static final int f57806xe35939b0 = 4;

    /* renamed from: REQUERY_TRANSACTION */
    public static final int f57807x9eaf6bd4 = 3;

    /* renamed from: RESPOND_TRANSACTION */
    public static final int f57808x428549f4 = 6;

    /* renamed from: descriptor */
    public static final java.lang.String f57809xd364d36f = "android.content.IBulkCursor";

    /* renamed from: close */
    void mo106144x5a5ddf8();

    /* renamed from: deactivate */
    void mo106145x88fbd074();

    /* renamed from: getExtras */
    android.os.Bundle mo106146x18421159();

    /* renamed from: getWindow */
    com.p314xaae8f345.p3121x37984a.C26876xa70fd706 mo106147x3622fee6(int i17);

    /* renamed from: onMove */
    void mo106148xc39cb650(int i17);

    /* renamed from: requery */
    int mo106149x414ef275(com.p314xaae8f345.p3121x37984a.InterfaceC26886xbc685ee6 interfaceC26886xbc685ee6);

    /* renamed from: respond */
    android.os.Bundle mo106150x41690095(android.os.Bundle bundle);
}
