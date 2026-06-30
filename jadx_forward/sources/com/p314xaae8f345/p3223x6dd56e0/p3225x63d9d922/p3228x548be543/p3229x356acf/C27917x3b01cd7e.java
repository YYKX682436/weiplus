package com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf;

/* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData */
/* loaded from: classes14.dex */
public class C27917x3b01cd7e {

    /* renamed from: image_list */
    public java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> f62286xa9fd6102;

    /* renamed from: stage_name */
    public java.lang.String f62287x42bb9f2c;

    /* renamed from: state */
    public int f62288x68ac491;

    /* renamed from: ui_end_delay */
    public int f62289xb0bc3534;

    /* renamed from: ui_start_delay */
    public int f62290x8d5ebe3b;

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData$RiskData */
    /* loaded from: classes14.dex */
    public static class RiskData {

        /* renamed from: checksum */
        public java.lang.String f62291x5b9b5c43;

        /* renamed from: image */
        public java.lang.String f62292x5faa95b;

        /* renamed from: image_name */
        public java.lang.String f62293xa9fe2aef;

        /* renamed from: key1 */
        public float f62294x322db2;

        /* renamed from: key2 */
        public int f62295x322db3;

        /* renamed from: key3 */
        public int f62296x322db4;

        /* renamed from: key4 */
        public long f62297x322db5;

        /* renamed from: task_type */
        public java.util.ArrayList<java.lang.Integer> f62298xac8bdb4;

        /* renamed from: timestamp */
        public long f62299x3492916;

        /* renamed from: getChecksum */
        public java.lang.String m120984xd77599b9() {
            return this.f62291x5b9b5c43;
        }

        /* renamed from: getImage */
        public java.lang.String m120985x74984fa5() {
            return this.f62292x5faa95b;
        }

        /* renamed from: getImage_name */
        public java.lang.String m120986x983ee2e5() {
            return this.f62293xa9fe2aef;
        }

        /* renamed from: getKey1 */
        public float m120987xfb819628() {
            return this.f62294x322db2;
        }

        /* renamed from: getKey2 */
        public int m120988xfb819629() {
            return this.f62295x322db3;
        }

        /* renamed from: getKey3 */
        public int m120989xfb81962a() {
            return this.f62296x322db4;
        }

        /* renamed from: getKey4 */
        public long m120990xfb81962b() {
            return this.f62297x322db5;
        }

        /* renamed from: getTask_type */
        public java.util.ArrayList<java.lang.Integer> m120991xa362efe() {
            return this.f62298xac8bdb4;
        }

        /* renamed from: getTimestamp */
        public long m120992x2b69a60() {
            return this.f62299x3492916;
        }

        /* renamed from: setChecksum */
        public void m120993xd22dfac5(java.lang.String str) {
            this.f62291x5b9b5c43 = str;
        }

        /* renamed from: setImage */
        public void m120994x53266a19(java.lang.String str) {
            this.f62292x5faa95b = str;
        }

        /* renamed from: setImage_name */
        public void m120995xc66330f1(java.lang.String str) {
            this.f62293xa9fe2aef = str;
        }

        /* renamed from: setKey1 */
        public void m120996x764c5d34(float f17) {
            this.f62294x322db2 = f17;
        }

        /* renamed from: setKey2 */
        public void m120997x764c5d35(int i17) {
            this.f62295x322db3 = i17;
        }

        /* renamed from: setKey3 */
        public void m120998x764c5d36(int i17) {
            this.f62296x322db4 = i17;
        }

        /* renamed from: setKey4 */
        public void m120999x764c5d37(long j17) {
            this.f62297x322db5 = j17;
        }

        /* renamed from: setTask_type */
        public void m121000x6689ef72(java.util.ArrayList<java.lang.Integer> arrayList) {
            this.f62298xac8bdb4 = arrayList;
        }

        /* renamed from: setTimestamp */
        public void m121001x5f0a5ad4(long j17) {
            this.f62299x3492916 = j17;
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData m120983x5a5dd5d() {
            com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData riskData = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData();
            riskData.f62293xa9fe2aef = this.f62293xa9fe2aef;
            riskData.f62294x322db2 = this.f62294x322db2;
            riskData.f62295x322db3 = this.f62295x322db3;
            riskData.f62296x322db4 = this.f62296x322db4;
            riskData.f62297x322db5 = this.f62297x322db5;
            riskData.f62298xac8bdb4 = this.f62298xac8bdb4;
            return riskData;
        }
    }

    /* renamed from: com.tencent.youtu.sdkkitframework.liveness.risk.CameraRiskData$StageName */
    /* loaded from: classes14.dex */
    public enum StageName {
        stage_start(1),
        stage_reflect(2),
        stage_end(3);

        private static java.util.HashMap<java.lang.Integer, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName> map = new java.util.HashMap<>();

        /* renamed from: value */
        public int f62304x6ac9171;

        static {
            for (com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.StageName stageName : m121004xcee59d22()) {
                map.put(java.lang.Integer.valueOf(stageName.f62304x6ac9171), stageName);
            }
        }

        StageName(int i17) {
            this.f62304x6ac9171 = i17;
        }
    }

    /* renamed from: getImage_list */
    public java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> m120974x983e18f8() {
        return this.f62286xa9fd6102;
    }

    /* renamed from: getStage_name */
    public java.lang.String m120975x30fc5722() {
        return this.f62287x42bb9f2c;
    }

    /* renamed from: getUi_end_delay */
    public int m120976x11aec7aa() {
        return this.f62289xb0bc3534;
    }

    /* renamed from: getUi_start_delay */
    public int m120977x7bf68b31() {
        return this.f62290x8d5ebe3b;
    }

    /* renamed from: setImage_list */
    public void m120978xc6626704(java.util.ArrayList<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> arrayList) {
        this.f62286xa9fd6102 = arrayList;
    }

    /* renamed from: setStage_name */
    public void m120979x5f20a52e(java.lang.String str) {
        this.f62287x42bb9f2c = str;
    }

    /* renamed from: setUi_end_delay */
    public void m120980x47f7c2b6(int i17) {
        this.f62289xb0bc3534 = i17;
    }

    /* renamed from: setUi_start_delay */
    public void m120981x43ecf33d(int i17) {
        this.f62290x8d5ebe3b = i17;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e m120973x5a5dd5d() {
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e c27917x3b01cd7e = new com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e();
        c27917x3b01cd7e.f62287x42bb9f2c = this.f62287x42bb9f2c;
        c27917x3b01cd7e.f62290x8d5ebe3b = this.f62290x8d5ebe3b;
        c27917x3b01cd7e.f62289xb0bc3534 = this.f62289xb0bc3534;
        if (this.f62286xa9fd6102 != null) {
            c27917x3b01cd7e.f62286xa9fd6102 = new java.util.ArrayList<>();
            java.util.Iterator<com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3228x548be543.p3229x356acf.C27917x3b01cd7e.RiskData> it = this.f62286xa9fd6102.iterator();
            while (it.hasNext()) {
                c27917x3b01cd7e.f62286xa9fd6102.add(it.next().m120983x5a5dd5d());
            }
        }
        return c27917x3b01cd7e;
    }
}
