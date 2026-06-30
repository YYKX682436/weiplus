package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb;

/* renamed from: com.tencent.youtu.sdkkitframework.common.YtSDKStats */
/* loaded from: classes14.dex */
public class C27893x5c7734e0 extends com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb {

    /* renamed from: ytSDKStats */
    private static com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0 f61668xe5a558c0;

    /* renamed from: currentAction */
    private java.lang.String f61669x6610690f;

    /* renamed from: currentEnterTimeStampMS */
    private long f61670x7a8636bd;

    /* renamed from: currentState */
    private java.lang.String f61671x56e49a98;

    /* renamed from: preInfo */
    private java.lang.String f61672xecf481f1;

    /* renamed from: preUpdateState */
    private java.lang.String f61673x5109b2a5;

    /* renamed from: stateNameMap */
    private java.util.HashMap<java.lang.String, java.lang.Object> f61674x70f66100 = new java.util.HashMap<>();

    /* renamed from: clearInstance */
    public static synchronized void m120653xf5161202() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.class) {
            if (f61668xe5a558c0 != null) {
                f61668xe5a558c0 = null;
            }
        }
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0 m120654x9cf0d20b() {
        synchronized (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.class) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0 c27893x5c7734e0 = f61668xe5a558c0;
            if (c27893x5c7734e0 != null) {
                return c27893x5c7734e0;
            }
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0 c27893x5c7734e02 = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0();
            f61668xe5a558c0 = c27893x5c7734e02;
            return c27893x5c7734e02;
        }
    }

    /* renamed from: getNowTimeStamp */
    public static java.lang.String m120655x458d1136() {
        return java.lang.String.valueOf(java.lang.System.currentTimeMillis());
    }

    /* renamed from: makeReport */
    private void m120656xcd79cc2(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.Object> hashMap, java.lang.String str3, java.lang.String str4) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap2 = new java.util.HashMap<>();
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("state_id", str);
        hashMap3.put("state_action", str2);
        if (hashMap != null) {
            hashMap3.put("state_error", hashMap);
        }
        if (str3 != null) {
            hashMap3.put("state_cost", str3);
        }
        if (str4 != null) {
            hashMap3.put("state_info", str4);
        }
        hashMap2.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61552x12652331, hashMap3);
        m120657x6fd1d231(hashMap2);
    }

    /* renamed from: sendStateEvent */
    private void m120657x6fd1d231(java.util.HashMap<java.lang.String, java.lang.Object> hashMap) {
        if (hashMap != null) {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27897x51bf805.m120703x9cf0d20b().m120713x2af1ece2(hashMap);
        }
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: enterFirst */
    public void mo120658xcdd362b8() {
    }

    /* renamed from: enterState */
    public void m120659xce8f5499(java.lang.String str) {
        java.lang.Object obj = this.f61674x70f66100.get(str);
        if (obj == null) {
            return;
        }
        this.f61669x6610690f = "enter";
        int intValue = ((java.lang.Integer) obj).intValue();
        if (intValue == 0) {
            m120660xadb51e13();
            if (this.f61669x6610690f != null) {
                this.f61670x7a8636bd = java.lang.System.currentTimeMillis();
                this.f61671x56e49a98 = str;
                m120656xcd79cc2(str, this.f61669x6610690f, null, null, null);
            }
        }
        this.f61674x70f66100.put(str, java.lang.Integer.valueOf(intValue + 1));
    }

    /* renamed from: exitState */
    public void m120660xadb51e13() {
        if (this.f61671x56e49a98 != null) {
            m120656xcd79cc2(this.f61671x56e49a98, "exit", null, java.lang.Long.toString(java.lang.System.currentTimeMillis() - this.f61670x7a8636bd), null);
        }
    }

    /* renamed from: registerStateName */
    public void m120661xd8d5bb59(java.lang.String str) {
        this.f61674x70f66100.put(str, 0);
    }

    /* renamed from: reportError */
    public void m120662xefdead34(int i17, java.lang.String str) {
        java.util.HashMap<java.lang.String, java.lang.Object> hashMap = new java.util.HashMap<>();
        hashMap.put(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, java.lang.Integer.valueOf(i17));
        hashMap.put("error_msg", str);
        m120656xcd79cc2(this.f61671x56e49a98, this.f61669x6610690f, hashMap, null, null);
    }

    /* renamed from: reportInfo */
    public void m120663x73197402(java.lang.String str) {
        java.lang.String str2 = this.f61672xecf481f1;
        if (str2 == null || !str2.equals(str)) {
            this.f61672xecf481f1 = str;
        }
        m120656xcd79cc2(this.f61671x56e49a98, this.f61669x6610690f, null, null, str);
    }

    @Override // com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.AbstractC27898x7ecec5bb
    /* renamed from: reset */
    public void mo120664x6761d4f() {
        java.util.Iterator<java.lang.String> it = this.f61674x70f66100.keySet().iterator();
        while (it.hasNext()) {
            this.f61674x70f66100.put(it.next(), 0);
        }
        this.f61671x56e49a98 = null;
        this.f61673x5109b2a5 = null;
        this.f61672xecf481f1 = null;
    }

    /* renamed from: updateState */
    public void m120665xdd28b148(java.lang.String str) {
        this.f61669x6610690f = "update";
        java.lang.String str2 = this.f61673x5109b2a5;
        if (str2 == null || !str2.equals(this.f61671x56e49a98)) {
            java.lang.String str3 = this.f61671x56e49a98;
            this.f61673x5109b2a5 = str3;
            m120656xcd79cc2(str3, this.f61669x6610690f, null, null, null);
        }
    }
}
