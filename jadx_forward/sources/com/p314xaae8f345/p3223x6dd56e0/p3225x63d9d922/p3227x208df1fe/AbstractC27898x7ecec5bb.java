package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe;

/* renamed from: com.tencent.youtu.sdkkitframework.framework.YtFSMBaseState */
/* loaded from: classes14.dex */
public abstract class AbstractC27898x7ecec5bb {
    private static final java.lang.String TAG = "YtFSMBaseState";

    /* renamed from: isFirstEnter */
    protected boolean f61737x76646ed2 = true;

    /* renamed from: printFrameLogTime */
    private long f61738x45bf7d51;

    /* renamed from: stateData */
    protected java.util.HashMap<java.lang.String, java.lang.Object> f61739x83a477db;

    /* renamed from: stateName */
    protected java.lang.String f61740x83a902bc;

    /* renamed from: stateSimpleName */
    protected java.lang.String f61741x71e9d6ce;

    /* renamed from: containsKey */
    public boolean m120723xc6607c0(java.lang.String str) {
        return this.f61739x83a477db.containsKey(str);
    }

    /* renamed from: enter */
    public void mo120689x5c306d8() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120659xce8f5499(this.f61741x71e9d6ce);
        if (this.f61737x76646ed2) {
            this.f61737x76646ed2 = false;
            mo120658xcdd362b8();
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61740x83a902bc + " enter");
    }

    /* renamed from: enterFirst */
    public abstract void mo120658xcdd362b8();

    /* renamed from: exit */
    public void mo120724x2fb91e() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61740x83a902bc + " exit");
    }

    /* renamed from: getStateDataBy */
    public java.lang.Object m120725x63c3c5c(java.lang.String str) {
        return this.f61739x83a477db.get(str);
    }

    /* renamed from: getStateName */
    public java.lang.String m120726x83167406() {
        return this.f61740x83a902bc;
    }

    /* renamed from: getStateSimpleName */
    public java.lang.String m120727x564ba898() {
        return this.f61741x71e9d6ce;
    }

    /* renamed from: handleEvent */
    public void mo120728x5797ad52(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.YtFrameworkFireEventType ytFrameworkFireEventType, java.lang.Object obj) {
    }

    /* renamed from: handleStateAction */
    public void mo120729x475c0edf(java.lang.String str, java.lang.Object obj) {
    }

    /* renamed from: loadStateWith */
    public void mo120730xc7c4b6b1(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f61740x83a902bc = str;
        try {
            this.f61741x71e9d6ce = java.lang.Class.forName(str).getSimpleName();
        } catch (java.lang.Exception unused) {
            this.f61741x71e9d6ce = str.split("\\.")[r2.length - 1];
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "load " + this.f61741x71e9d6ce);
        this.f61739x83a477db = new java.util.HashMap<>();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120661xd8d5bb59(this.f61741x71e9d6ce);
    }

    /* renamed from: moveToNextState */
    public void mo120731xb14ae492() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61740x83a902bc + " move to next");
    }

    /* renamed from: onPause */
    public void mo120732xb01dfb57() {
    }

    /* renamed from: onResume */
    public void mo120733x57429eec() {
    }

    /* renamed from: reset */
    public void mo120664x6761d4f() {
        this.f61737x76646ed2 = true;
        this.f61739x83a477db.clear();
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61740x83a902bc + " reset");
    }

    /* renamed from: unload */
    public void mo120734xcde7deff() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, "unload " + this.f61741x71e9d6ce);
        this.f61739x83a477db.clear();
    }

    /* renamed from: update */
    public void mo120735xce0038c9(byte[] bArr, int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27893x5c7734e0.m120654x9cf0d20b().m120665xdd28b148(this.f61740x83a902bc);
        if (java.lang.System.currentTimeMillis() - this.f61738x45bf7d51 > 3000) {
            this.f61738x45bf7d51 = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.d(TAG, this.f61740x83a902bc + " update bgr image width:" + i17 + ",height:" + i18);
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27892x9d9854ab.i(TAG, this.f61740x83a902bc + " update image : " + i17 + "x" + i18 + " type " + i19);
    }

    /* renamed from: updateDataBy */
    public void m120736xad515fca(java.lang.String str, java.lang.Object obj) {
        this.f61739x83a477db.put(str, obj);
    }

    /* renamed from: updateSDKSetting */
    public void mo120737x1b37865f(org.json.JSONObject jSONObject) {
    }
}
