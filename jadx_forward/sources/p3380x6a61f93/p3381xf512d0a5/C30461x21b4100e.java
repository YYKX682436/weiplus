package p3380x6a61f93.p3381xf512d0a5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u000e"}, d2 = {"Lurgen/ur_0025/UR_86B0;", "", "<init>", "()V", "URB_1434", "", "obj", "Lcom/tencent/unit_rc/BaseObjectDef;", "type", "", "context", "", "URB_F923", "callback", "products-all_java"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: urgen.ur_0025.UR_86B0 */
/* loaded from: classes11.dex */
public final class C30461x21b4100e {

    /* renamed from: INSTANCE */
    public static final p3380x6a61f93.p3381xf512d0a5.C30461x21b4100e f77058x4fbc8495 = new p3380x6a61f93.p3381xf512d0a5.C30461x21b4100e();

    private C30461x21b4100e() {
    }

    /* renamed from: URB_1434 */
    public static final void m169131xe574827e(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, int type, byte[] context) {
        jm4.h0 h0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        jm4.h0.f381920d.getClass();
        if (type == 1) {
            h0Var = jm4.h0.f381921e;
        } else {
            if (type != 2) {
                throw new java.lang.IllegalArgumentException("Invalid AudioFocusType value: " + type);
            }
            h0Var = jm4.h0.f381922f;
        }
        ((ul4.i) ((jm4.d0) obj)).e(h0Var, context);
    }

    /* renamed from: URB_F923 */
    public static final void m169132xe57e20ee(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 obj, com.p314xaae8f345.p3118xeeebfacc.InterfaceC26826xca759055 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        jm4.e0 e0Var = (jm4.e0) callback;
        ul4.i iVar = (ul4.i) ((jm4.d0) obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setAudioFocusCallback, taskId:");
        sb6.append(iVar.f510151f);
        sb6.append(",callback:");
        sb6.append(e0Var != null ? java.lang.Integer.valueOf(e0Var.hashCode()) : "null");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAudioFocusController", sb6.toString());
        iVar.f510154i = e0Var;
    }
}
