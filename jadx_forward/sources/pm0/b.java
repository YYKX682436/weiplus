package pm0;

/* loaded from: classes12.dex */
public final class b implements pm0.z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long[] f438292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f438293b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f438294c;

    /* renamed from: d, reason: collision with root package name */
    public final pm0.a f438295d;

    public b(java.lang.Long[] idKeyArray, int i17, java.lang.String name, pm0.a generator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(idKeyArray, "idKeyArray");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(generator, "generator");
        this.f438292a = idKeyArray;
        this.f438293b = i17;
        this.f438294c = name;
        this.f438295d = generator;
    }

    @Override // pm0.z
    public void c(java.lang.String key, boolean z17, pm0.w level, java.lang.String str, boolean z18, boolean z19, yz5.a message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (z17) {
            return;
        }
        e("assertTrue", key, (java.lang.String) message.mo152xb9724478(), z18, z19, level, str);
    }

    @Override // pm0.z
    public void d(java.lang.String key, boolean z17, pm0.w level, java.lang.String str, boolean z18, boolean z19, yz5.a message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(level, "level");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        if (z17) {
            e("assertFalse", key, (java.lang.String) message.mo152xb9724478(), z18, z19, level, str);
        }
    }

    public final void e(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, pm0.w wVar, java.lang.String str4) {
        int a17 = this.f438295d.a(str2);
        java.lang.String str5 = str + ": key=[" + str2 + ':' + a17 + "] owner=" + str4 + " message=" + str3;
        int i17 = wVar.f438341d;
        pm0.w wVar2 = pm0.w.f438337e;
        if (i17 <= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f438294c, str5);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f438294c, str5);
        }
        if (z17) {
            int i18 = a17 / 255;
            if (a17 > 0) {
                java.lang.Long[] lArr = this.f438292a;
                if (lArr.length > i18) {
                    vo.c.INSTANCE.b(lArr[i18].longValue(), a17, 1L);
                }
            }
            vo.c.f519997e.a(this.f438293b, java.lang.String.valueOf(this.f438295d.mo68468x52c258a2()), java.lang.String.valueOf(a17), str3, str2, java.lang.Integer.valueOf(wVar.f438341d), str4);
        }
        if (z18) {
            throw new iz5.b(str5);
        }
    }
}
