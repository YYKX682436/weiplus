package zs5;

/* loaded from: classes15.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f557010d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f557011e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p2891x34da02.C25307xad2910d9 f557012f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f557013g;

    /* renamed from: h, reason: collision with root package name */
    public final kd0.b3 f557014h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f557015i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zs5.u0 f557016m;

    public t0(zs5.u0 u0Var, com.p314xaae8f345.p2891x34da02.C25307xad2910d9 c25307xad2910d9, kd0.b3 b3Var) {
        this.f557016m = u0Var;
        this.f557013g = new int[]{0};
        this.f557010d = b3Var.f388138b;
        this.f557011e = b3Var.f388139c;
        this.f557012f = c25307xad2910d9;
        int[] iArr = b3Var.f388140d;
        if (iArr != null && iArr.length > 0) {
            this.f557013g = iArr;
        }
        this.f557014h = b3Var;
        this.f557015i = b3Var.f388144h;
    }

    public final void a(kd0.c3 c3Var, kd0.b3 b3Var) {
        synchronized (this.f557016m.f557023d) {
            if (((java.util.HashMap) this.f557016m.f557022c).containsKey(this.f557010d)) {
                java.util.Iterator it = ((java.util.List) ((java.util.HashMap) this.f557016m.f557022c).get(this.f557010d)).iterator();
                while (it.hasNext()) {
                    long longValue = ((java.lang.Long) it.next()).longValue();
                    if (((java.util.HashMap) this.f557016m.f557021b).containsKey(java.lang.Long.valueOf(longValue))) {
                        ((kd0.a3) ((java.util.HashMap) this.f557016m.f557021b).get(java.lang.Long.valueOf(longValue))).a(longValue, c3Var);
                        ((java.util.HashMap) this.f557016m.f557021b).remove(java.lang.Long.valueOf(longValue));
                    }
                    ((java.util.HashMap) this.f557016m.f557020a).remove(java.lang.Long.valueOf(longValue));
                }
                ((java.util.HashMap) this.f557016m.f557022c).remove(this.f557010d);
            }
            if (((java.util.HashMap) this.f557016m.f557022c).isEmpty()) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = b3Var != null ? java.lang.Boolean.valueOf(b3Var.f388147k) : "null";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] release QBar %s", objArr);
                synchronized (this.f557016m.f557024e) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = b3Var != null ? java.lang.Boolean.valueOf(b3Var.f388147k) : "null";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxFileDecodeQueue", "[scanDecode-file] release QBar %s", objArr2);
                    zs5.q0 q0Var = zs5.q0.f556994a;
                    if (q0Var.d() && (b3Var == null || b3Var.f388147k)) {
                        q0Var.mo142436x41012807();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x056b A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05b0 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0574 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042b A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0397 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bd A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d4 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f8 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040f A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02df A[Catch: all -> 0x060d, TryCatch #1 {all -> 0x060d, blocks: (B:51:0x014d, B:53:0x016c, B:54:0x016f, B:56:0x018b, B:57:0x019d, B:59:0x01a5, B:60:0x01aa, B:62:0x01c8, B:64:0x01ce, B:66:0x0226, B:68:0x022f, B:69:0x027f, B:192:0x02d2, B:198:0x02df, B:200:0x02eb, B:201:0x0308, B:214:0x0256), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x036a A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0414 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0498 A[Catch: all -> 0x0612, TryCatch #0 {all -> 0x0612, blocks: (B:72:0x0357, B:74:0x036a, B:75:0x036e, B:79:0x0414, B:80:0x0419, B:83:0x042f, B:84:0x0495, B:86:0x0498, B:89:0x049f, B:93:0x04a5, B:95:0x04ab, B:97:0x04b1, B:98:0x04b7, B:100:0x04bd, B:102:0x04e6, B:105:0x0523, B:108:0x055d, B:111:0x05e9, B:114:0x05f8, B:115:0x0606, B:116:0x060b, B:120:0x056b, B:122:0x0571, B:123:0x0578, B:124:0x05ad, B:126:0x05b0, B:129:0x05b7, B:133:0x05bd, B:138:0x0574, B:139:0x0541, B:140:0x0518, B:145:0x042b, B:148:0x0389, B:154:0x0397, B:156:0x03a1, B:162:0x03ae, B:165:0x03b9, B:167:0x03bd, B:168:0x03c0, B:169:0x03ce, B:171:0x03d4, B:174:0x03e5, B:179:0x03e9, B:181:0x03f8, B:183:0x03fc, B:185:0x0404, B:186:0x0407, B:187:0x040f, B:203:0x030e, B:205:0x0335, B:206:0x033a, B:208:0x033e, B:210:0x034b, B:211:0x034f, B:212:0x0354, B:219:0x0610), top: B:50:0x014d }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 1556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zs5.t0.run():void");
    }
}
