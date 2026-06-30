package an1;

/* loaded from: classes14.dex */
public abstract class e {
    public static final boolean a(java.util.Stack mDeviceQueue) {
        java.lang.Integer num;
        java.lang.Integer num2;
        kotlin.jvm.internal.o.g(mDeviceQueue, "mDeviceQueue");
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeakerUtil", " request the speaker resource");
        if ((mDeviceQueue.size() != 1 || (num2 = (java.lang.Integer) mDeviceQueue.lastElement()) == null || num2.intValue() != 1) && !mDeviceQueue.isEmpty() && (num = (java.lang.Integer) mDeviceQueue.lastElement()) != null && num.intValue() == 1) {
            return false;
        }
        if (mDeviceQueue.contains(1)) {
            mDeviceQueue.removeElement(1);
        }
        mDeviceQueue.push(1);
        return true;
    }
}
