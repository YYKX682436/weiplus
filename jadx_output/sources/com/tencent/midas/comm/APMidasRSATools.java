package com.tencent.midas.comm;

/* loaded from: classes13.dex */
public class APMidasRSATools {
    private final java.lang.String DEFAULT_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy+ZF2XdZ6RwK/lAtyC7h\rLA4KaURXrD7gEGcx+t/l8KKLTLfR3j4vOHXHXjixipSXicyJcDH74rfO7ISnFkWQ\r+kVmB5kfhdrq5z6D/h/q7ko7MdU9SUlfZfAxwnS4VJY4xWoFWG9ZAoh5ZHJcloDU\rol0qYTUX/yWNiHkoUtnU+SP+ZJjODpqcYuVdLxlA0YelafeBc3SCeuEcPH9lIiRZ\rw0I91wQvPq7gM7/6qnMEdzm7nJdCIni83INl2bh3gW5UBwFBpNrI/fZkgDA4aVGV\rpplEP9bChkCpq2e1T9gw0ODuEVmgVaSvdwHLMYcGn+nYjWDYy16b6ImdkubF8q5l\rhwIDAQAB\r";
    private java.security.interfaces.RSAPublicKey publicKey;

    private byte charToByte(char c17) {
        return (byte) "0123456789ABCDEF".indexOf(c17);
    }

    private byte[] decrypt(java.security.interfaces.RSAPublicKey rSAPublicKey, byte[] bArr) {
        if (rSAPublicKey == null) {
            throw new java.lang.Exception("解密私钥为空, 请设置");
        }
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA");
            cipher.init(2, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (java.security.InvalidKeyException unused) {
            throw new java.lang.Exception("密钥无效，请检查确认");
        } catch (java.security.NoSuchAlgorithmException unused2) {
            throw new java.lang.Exception("没有这样的解密算法");
        } catch (javax.crypto.BadPaddingException unused3) {
            throw new java.lang.Exception("密文数据已损坏");
        } catch (javax.crypto.IllegalBlockSizeException unused4) {
            throw new java.lang.Exception("密文长度无效或者过长");
        } catch (java.lang.Exception e17) {
            com.tencent.midas.comm.APLog.i("APMidasRSATools exception", e17.toString());
            throw new java.lang.Exception("其他错误");
        }
    }

    private byte[] getByte(java.lang.String str) {
        return hexStringToBytes(str);
    }

    private byte[] hexStringToBytes(java.lang.String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        java.lang.String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i17 = 0; i17 < length; i17++) {
            int i18 = i17 * 2;
            bArr[i17] = (byte) (charToByte(charArray[i18 + 1]) | (charToByte(charArray[i18]) << 4));
        }
        return bArr;
    }

    private void loadPublicKey(java.lang.String str) {
        try {
            this.publicKey = (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(str, 0)));
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String deCodeKey(java.lang.String str) {
        try {
            loadPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAy+ZF2XdZ6RwK/lAtyC7h\rLA4KaURXrD7gEGcx+t/l8KKLTLfR3j4vOHXHXjixipSXicyJcDH74rfO7ISnFkWQ\r+kVmB5kfhdrq5z6D/h/q7ko7MdU9SUlfZfAxwnS4VJY4xWoFWG9ZAoh5ZHJcloDU\rol0qYTUX/yWNiHkoUtnU+SP+ZJjODpqcYuVdLxlA0YelafeBc3SCeuEcPH9lIiRZ\rw0I91wQvPq7gM7/6qnMEdzm7nJdCIni83INl2bh3gW5UBwFBpNrI/fZkgDA4aVGV\rpplEP9bChkCpq2e1T9gw0ODuEVmgVaSvdwHLMYcGn+nYjWDYy16b6ImdkubF8q5l\rhwIDAQAB\r");
            return new java.lang.String(decrypt(this.publicKey, getByte(str)));
        } catch (java.lang.Exception unused) {
            return "";
        }
    }
}
