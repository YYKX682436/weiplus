package sg0;

@j95.b
/* loaded from: classes.dex */
public class e2 extends i95.w implements tg0.p1 {
    public boolean wi(int i17, int i18) {
        org.json.JSONArray optJSONArray = su4.o2.d("hideEnterKeyboard").optJSONArray("items");
        if (optJSONArray == null) {
            return false;
        }
        for (int i19 = 0; i19 < optJSONArray.length(); i19++) {
            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i19);
            if (optJSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0) == i17 && optJSONObject.optInt("type", 0) == i18) {
                return true;
            }
        }
        return false;
    }
}
